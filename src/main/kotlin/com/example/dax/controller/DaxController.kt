package com.example.dax.controller

import com.example.dax.service.DaxDependencyService
import com.example.dax.service.TableFieldDependency
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/dax")
class DaxController(
    private val daxDependencyService: DaxDependencyService
) {

    // Example: POST /api/dax/dependencies
    @PostMapping("/dependencies")
    fun getDependencies(@RequestBody request: DaxExpressionRequest): List<TableFieldDependency> {
        return daxDependencyService.findDependencies(request.expression)
    }

    // POST /api/dax/tokens
    @PostMapping("/tokens")
    fun getTokens(@RequestBody request: DaxExpressionRequest): List<String> {
        return daxDependencyService.getTokens(request.expression)
    }

    @PostMapping("/parseTree")
    fun getParseTree(@RequestBody request: DaxExpressionRequest): String {
        return daxDependencyService.getParseTree(request.expression)
    }
}

// Request & Response Models
data class DaxExpressionRequest(val expression: String)