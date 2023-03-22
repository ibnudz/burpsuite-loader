[
  {
    "ProfileName": "Solarwinds_default_admin",
    "Name": "",
    "Enabled": true,
    "Scanner": 1,
    "Author": "@burpbounty",
    "Payloads": [
      "true,/SolarWinds/InformationService/v3/Json/Query?query\u003dSELECT+Uri+FROM+Orion.Pollers+ORDER+BY+PollerID+WITH+ROWS+1+TO+3+WITH+TOTALROWS"
    ],
    "Encoder": [],
    "UrlEncode": false,
    "CharsToUrlEncode": "",
    "Grep": [
      "true,,(totalRow|result|swi)s(:\\/\\/)?",
      "true,And,(Orion\\.|Poller(ID)?)s?"
    ],
    "Tags": [
      "All"
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
    "OnlyHTTP": false,
    "IsContentType": false,
    "ContentType": "",
    "HttpResponseCode": "",
    "NegativeCT": false,
    "IsResponseCode": true,
    "ResponseCode": "200",
    "NegativeRC": false,
    "urlextension": "",
    "isurlextension": false,
    "NegativeUrlExtension": false,
    "isHeaderValue": false,
    "sequence": false,
    "NewHeaders": [],
    "MatchType": 2,
    "Scope": 0,
    "RedirType": 0,
    "MaxRedir": 0,
    "requestType": 1,
    "rawRequest": "",
    "payloadPosition": 1,
    "payloadsFile": "",
    "grepsFile": "",
    "IssueName": "Solarwinds_default_admin",
    "IssueSeverity": "High",
    "IssueConfidence": "Certain",
    "IssueDetail": "SolarWinds Orion Default Credentials\n\u003cbr/\u003e\u003cbr/\u003e- PAYLOAD: \u003cbr/\u003e\u003cpayload\u003e\n\u003cbr/\u003e\u003cbr/\u003e\n- GREP: \u003cbr/\u003e\u003cgrep\u003e",
    "RemediationDetail": "",
    "IssueBackground": "",
    "RemediationBackground": "",
    "Header": [
      {
        "type": "Request",
        "match": "",
        "replace": "Authorization: Basic YWRtaW46",
        "regex": "String"
      }
    ],
    "VariationAttributes": [],
    "InsertionPointType": [
      66
    ],
    "Scanas": false,
    "Scantype": 0,
    "pathDiscovery": false,
    "changeHttpRequest": false,
    "showIssue": false,
    "changeHttpRequestType": 1
  }
]