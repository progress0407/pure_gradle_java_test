package clonecoding.toby.supertypetoken;

import lombok.Getter;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Objects;

// eq hsh 미작성
@Getter
public class TypeReferenceV2<T> {

    static final String CONSTRUCT_EXCEPTION_MESSAGE = "해당 객체는 상속해서 만들어져야 합니다.";

    private Type type;

    public TypeReferenceV2() {
        Type superType = getClass().getGenericSuperclass();
        // 상속을 받은 게 아니라면 예외가 터진다
        if (superType instanceof ParameterizedType) {
            this.type = ((ParameterizedType) superType).getActualTypeArguments()[0];
            return;
        }
        throw new RuntimeException(CONSTRUCT_EXCEPTION_MESSAGE);
    }
}
