[
  {
    "ProfileName": "CORS Misconfiguration",
    "Name": "",
    "Enabled": true,
    "Scanner": 1,
    "Author": "@burpbounty",
    "Payloads": [
      "true,https://burpbounty.net"
    ],
    "Encoder": [],
    "UrlEncode": false,
    "CharsToUrlEncode": "",
    "Grep": [
      "true,,Access-Control-Allow-Credential: true",
      "true,Or,Access-Control-Allow-Origin: https://burpbounty.net",
      "true,Or,Access-Control-Allow-Origin: null"
    ],
    "Tags": [
      "All",
      "CORS"
    ],
    "PayloadResponse": false,
    "NotResponse": false,
    "TimeOut1": "",
    "TimeOut2": "",
    "isTime": false,
    "contentLength": "",
    "iscontentLength": false,
    "CaseSensitive": false,
    "ExcludeHTTP": false,
    "OnlyHTTP": true,
    "IsContentType": false,
    "ContentType": "",
    "HttpResponseCode": "",
    "NegativeCT": false,
    "IsResponseCode": false,
    "ResponseCode": "",
    "NegativeRC": false,
    "urlextension": "",
    "isurlextension": false,
    "NegativeUrlExtension": false,
    "isHeaderValue": true,
    "sequence": false,
    "NewHeaders": [
      "Origin"
    ],
    "MatchType": 1,
    "Scope": 0,
    "RedirType": 4,
    "MaxRedir": 3,
    "requestType": 1,
    "rawRequest": "",
    "payloadPosition": 1,
    "payloadsFile": "",
    "grepsFile": "",
    "IssueName": "CORS Misconfiguration",
    "IssueSeverity": "Low",
    "IssueConfidence": "Tentative",
    "IssueDetail": "https://github.com/swisskyrepo/PayloadsAllTheThings/tree/master/CORS%20Misconfiguration\n\n\u003cbr/\u003e\u003cbr/\u003e- PAYLOAD: \u003cbr/\u003e\u003cpayload\u003e\n\u003cbr/\u003e\u003cbr/\u003e\n- GREP: \u003cbr/\u003e\u003cgrep\u003e",
    "RemediationDetail": "",
    "IssueBackground": "",
    "RemediationBackground": "",
    "Header": [],
    "VariationAttributes": [],
    "InsertionPointType": [
      64,
      78
    ],
    "Scanas": false,
    "Scantype": 0,
    "pathDiscovery": false,
    "changeHttpRequest": false,
    "showIssue": false,
    "changeHttpRequestType": 1
  }
]