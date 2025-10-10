interface Mediator {
    void notify(Component sender, String event);
}

abstract class Component {
    protected Mediator mediator;

    public Component(Mediator mediator) {
        this.mediator = mediator;
    }
}

// Componentes concretos A B C D
class ComponentA extends Component {
    public ComponentA(Mediator mediator) {
        super(mediator);
    }

    public void operationA() {
        System.out.println("A: executou operação A");
        mediator.notify(this, "A");
    }

    public void reactOnB() {
        System.out.println("A: reagiu à operação B");
    }
}

class ComponentB extends Component {
    public ComponentB(Mediator mediator) {
        super(mediator);
    }

    public void operationB() {
        System.out.println("B: executou operação B");
        mediator.notify(this, "B");
    }

    public void reactOnA() {
        System.out.println("B: reagiu à operação A");
    }
}

class ComponentC extends Component {
    public ComponentC(Mediator mediator) {
        super(mediator);
    }

    public void operationC() {
        System.out.println("C: executou operação C");
        mediator.notify(this, "C");
    }

    public void reactOnD() {
        System.out.println("C: reagiu à operação D");
    }
}

class ComponentD extends Component {
    public ComponentD(Mediator mediator) {
        super(mediator);
    }

    public void operationD() {
        System.out.println("D: executou operação D");
        mediator.notify(this, "D");
    }

    public void reactOnC() {
        System.out.println("D: reagiu à operação C");
    }
}

// Mediador concreto
class ConcreteMediator implements Mediator {
    ComponentA componentA;
    ComponentB componentB;
    ComponentC componentC;
    ComponentD componentD;

    public void setComponents(ComponentA a, ComponentB b, ComponentC c, ComponentD d) {
        this.componentA = a;
        this.componentB = b;
        this.componentC = c;
        this.componentD = d;
    }

    @Override
    public void notify(Component sender, String event) {
        if (sender == componentA) {
            System.out.println("Mediator: recebeu evento de A");
            componentB.reactOnA();
        } else if (sender == componentB) {
            System.out.println("Mediator: recebeu evento de B");
            componentA.reactOnB();
        } else if (sender == componentC) {
            System.out.println("Mediator: recebeu evento de C");
            componentD.reactOnC();
        } else if (sender == componentD) {
            System.out.println("Mediator: recebeu evento de D");
            componentC.reactOnD();
        }
    }
}

public class Cliente {
    public static void main(String[] args) {
        ConcreteMediator mediator = new ConcreteMediator();

        ComponentA a = new ComponentA(mediator);
        ComponentB b = new ComponentB(mediator);
        ComponentC c = new ComponentC(mediator);
        ComponentD d = new ComponentD(mediator);

        mediator.setComponents(a, b, c, d);
        System.out.println();
        a.operationA();
        System.out.println();
        d.operationD();
    }
}
