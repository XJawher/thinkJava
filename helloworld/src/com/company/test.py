import json
from orcabd_ui_common.users import services as users_services

# if cluster has a user named sys_admin sys_admin ,do nothing
# if cluster does not has a user named sys_admin,delete all users
has_sys_admin = users_services.get_user_by_name('sys_admin')
has_sys_admin = json.loads(has_sys_admin)
all_users = users_services.get_user_by_page(1000000, 1, '')
all_users = json.loads(all_users)
if has_sys_admin['code'] != 0:
    # user list does not has a user named sys_admin,delete all user and create users named by sys_admin ,sec_admin ,log_admin
    user_list = all_users['data']['results']
    for user in user_list:
        remove_user_res = users_services.remove_user_by_name(user['name'])
        remove_user_res = json.loads(remove_user_res)
        if remove_user_res['code'] == 0:
            print 'delete user %s success' % (user['name'])
        else:
            print 'delete user %s failed,please check and retry' % (user['name'])
    users_services.create_user('sys_admin', 'Orcadt123456', 'admin', '', ['1', '4', '6'])
    print 'create user sys_admin success'
    users_services.create_user('sec_admin', 'Orcadt123456', 'admin', '', ['2', '3'])
    print 'create user sec_admin success'
    users_services.create_user('log_admin', 'Orcadt123456', 'admin', '', ['5'])
    print 'create user log_admin success'
    print 'delete all user and create users named by sys_admin ,sec_admin ,log_admin success'
else:
    print 'the user named sys_admin is presenced in cluster, no oprated for this cluster'
    print all_users
