[
  {
    "enabled": true,
    "name": "Wordpress_Rule",
    "comments": "This rule, try to detect wordpress and execute common vulnerabilities in this framework",
    "scope": 0,
    "match_enabled": false,
    "operator": "",
    "profile_type": "",
    "passive_profile_type": "",
    "exec_enabled": false,
    "type": "",
    "active_profile_type": "",
    "match": [
      "true,,Passive Response,Wordpress detection"
    ],
    "execute": [
      "true,Profile,Wordpress_user_enum_oembed,First Match",
      "true,Profile,Wordpress_users_enum_yoastseo,First Match",
      "true,Profile,Wordpress_user_enum_json,First Match",
      "true,Profile,Wordpress_directory_listing,First Match",
      "true,Profile,Woody_Wordpress_RCE,First Match",
      "true,Profile,CVE-2020-24312_File_Manager_Wordpress_Backups,First Match",
      "true,Profile,Wordpress_Path_Traversal,First Match",
      "true,Profile,Wordpress_Config_Accessible,First Match",
      "true,Profile,easy_wp_smtp_listing_enabled,First Match",
      "true,Profile,CVE-2020-11738_Wordpress_Duplicator_Plugin_LFI,First Match"
    ]
  }
]