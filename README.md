# DentalMedicalRepo
If a dental plan gets updated then all it's subscribers subscribed to a particular plan gets updated.


curl --location --request PUT 'http://localhost:8080/dental-plan' \
--header 'Content-Type: application/json' \
--data-raw '{
  "planId": 101,
  "standardDeductible": 100.0,
  "preventiveFlag": true,
  "preventiveDeductible": 0.0,
  "basicFlag": false,
  "basicDeductible": 100.0,
  "majorFlag": true,
  "majorDeductible": 300.0,
  "orthoFlag": true,
  "orthoDeductible": 1500.0,
  "otherFlag": false,
  "otherDeductible": 100.0
}'

