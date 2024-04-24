import groovy.text.StreamingTemplateEngine

def createPod(input, variables) {
  def engine = new StreamingTemplateEngine()
  return engine.createTemplate(input).make(variables).toString()
}