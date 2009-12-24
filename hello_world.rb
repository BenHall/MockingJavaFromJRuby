require 'java'
require 'out.jar'

@list = java.util.ArrayList.new
@list.add "content"
puts @list.count

include_class Java::ClassWithInterface
v = ClassWithInterface.new
puts v.get_string

include_class Java::ImplementingMockableClass
i = ImplementingMockableClass.new(v)
puts i.output_string

class ClassWithInterface
  def get_string
    "mocked" 
  end
end
puts v.get_string

i = ImplementingMockableClass.new(v)
puts i.output_string