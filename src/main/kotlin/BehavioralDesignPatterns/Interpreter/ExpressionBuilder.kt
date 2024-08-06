package BehavioralDesignPatterns.Interpreter

class ExpressionBuilder(
    private val report : Report
) {
    fun build() : PermissionExpression {
        return when{
            report.permission.contains("AND") -> AndExpression(
                Permission(report.permission.split("AND")[0].trim()),
                Permission(report.permission.split("AND")[1].trim()),
            )
            report.permission.contains("OR") -> OrExpression(
                Permission(report.permission.split("OR")[0].trim()),
                Permission(report.permission.split("OR")[1].trim()),
            )
            report.permission.contains("NOT") -> NotExpression(
                Permission(report.permission.split("NOT")[1].trim()),
            )
            else -> Permission(report.permission)
        }
    }
}