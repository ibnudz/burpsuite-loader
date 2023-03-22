[
  {
    "enabled": true,
    "name": "CouchDB_Admin_Exposure",
    "comments": "Search for CouchDB endpoints and try to access sensitive information",
    "scope": 0,
    "match_enabled": false,
    "operator": "",
    "profile_type": "",
    "passive_profile_type": "",
    "exec_enabled": false,
    "type": "",
    "active_profile_type": "",
    "match": [
      "true,,Passive Request,CouchDB_Request",
      "true,And,Passive Response,CouchDB_Response"
    ],
    "execute": [
      "true,Profile,CouchDB_Admin_Exposure,All Matches"
    ]
  }
]