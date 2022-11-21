package com.example.messaging.controllers

import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.RestController


@RestController
@CrossOrigin(origins = ["/messaging/api/email/v1/"])
class EmailController {
}