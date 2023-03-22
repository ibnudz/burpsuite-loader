[
  {
    "enabled": true,
    "name": "Kubernetes_Rule",
    "comments": "Try to detect K8S API and access unauth sensitive info",
    "scope": 0,
    "match_enabled": false,
    "operator": "",
    "profile_type": "",
    "passive_profile_type": "",
    "exec_enabled": false,
    "type": "",
    "active_profile_type": "",
    "match": [
      "true,,Passive Response,Kubernetes_Response"
    ],
    "execute": [
      "true,Profile,Kubernetes_API_Exposed,All Matches"
    ]
  }
]