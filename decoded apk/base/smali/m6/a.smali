.class public abstract Lm6/a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lm6/a$a;,
        Lm6/a$b;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final zaD(Lm6/a$a;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    invoke-static {p0}, Lm6/a$a;->Q(Lm6/a$a;)Lm6/a$b;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, Lm6/a$a;->S(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_0
    return-object p1
.end method

.method private final zaE(Lm6/a$a;Ljava/lang/Object;)V
    .locals 3

    iget-object v0, p1, Lm6/a$a;->m:Ljava/lang/String;

    invoke-virtual {p1, p2}, Lm6/a$a;->R(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    iget v1, p1, Lm6/a$a;->k:I

    packed-switch v1, :pswitch_data_0

    :pswitch_0
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Unsupported type for conversion: "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_1
    if-eqz p2, :cond_0

    check-cast p2, [B

    invoke-virtual {p0, p1, v0, p2}, Lm6/a;->setDecodedBytesInternal(Lm6/a$a;Ljava/lang/String;[B)V

    return-void

    :cond_0
    invoke-static {v0}, Lm6/a;->zaG(Ljava/lang/String;)V

    return-void

    :pswitch_2
    check-cast p2, Ljava/lang/String;

    invoke-virtual {p0, p1, v0, p2}, Lm6/a;->setStringInternal(Lm6/a$a;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :pswitch_3
    if-eqz p2, :cond_1

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    invoke-virtual {p0, p1, v0, p2}, Lm6/a;->setBooleanInternal(Lm6/a$a;Ljava/lang/String;Z)V

    return-void

    :cond_1
    invoke-static {v0}, Lm6/a;->zaG(Ljava/lang/String;)V

    return-void

    :pswitch_4
    check-cast p2, Ljava/math/BigDecimal;

    invoke-virtual {p0, p1, v0, p2}, Lm6/a;->zab(Lm6/a$a;Ljava/lang/String;Ljava/math/BigDecimal;)V

    return-void

    :pswitch_5
    if-eqz p2, :cond_2

    check-cast p2, Ljava/lang/Double;

    invoke-virtual {p2}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v1

    invoke-virtual {p0, p1, v0, v1, v2}, Lm6/a;->zan(Lm6/a$a;Ljava/lang/String;D)V

    return-void

    :cond_2
    invoke-static {v0}, Lm6/a;->zaG(Ljava/lang/String;)V

    return-void

    :pswitch_6
    if-eqz p2, :cond_3

    check-cast p2, Ljava/lang/Long;

    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-virtual {p0, p1, v0, v1, v2}, Lm6/a;->setLongInternal(Lm6/a$a;Ljava/lang/String;J)V

    return-void

    :cond_3
    invoke-static {v0}, Lm6/a;->zaG(Ljava/lang/String;)V

    return-void

    :pswitch_7
    check-cast p2, Ljava/math/BigInteger;

    invoke-virtual {p0, p1, v0, p2}, Lm6/a;->zaf(Lm6/a$a;Ljava/lang/String;Ljava/math/BigInteger;)V

    return-void

    :pswitch_8
    if-eqz p2, :cond_4

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, v0, p2}, Lm6/a;->setIntegerInternal(Lm6/a$a;Ljava/lang/String;I)V

    return-void

    :cond_4
    invoke-static {v0}, Lm6/a;->zaG(Ljava/lang/String;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_1
    .end packed-switch
.end method

.method private static final zaF(Ljava/lang/StringBuilder;Lm6/a$a;Ljava/lang/Object;)V
    .locals 2

    iget v0, p1, Lm6/a$a;->i:I

    const/16 v1, 0xb

    if-eq v0, v1, :cond_1

    const/4 p1, 0x7

    if-ne v0, p1, :cond_0

    const-string p1, "\""

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    check-cast p2, Ljava/lang/String;

    invoke-static {p2}, Lo6/k;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_0
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void

    :cond_0
    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    return-void

    :cond_1
    iget-object p1, p1, Lm6/a$a;->o:Ljava/lang/Class;

    invoke-static {p1}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1, p2}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lm6/a;

    invoke-virtual {p1}, Lm6/a;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_0
.end method

.method private static final zaG(Ljava/lang/String;)V
    .locals 3

    const-string v0, "FastJsonResponse"

    const/4 v1, 0x6

    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v1

    if-eqz v1, :cond_0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Output field ("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, ") has a null value, but expected a primitive"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {v0, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    return-void
.end method


# virtual methods
.method public addConcreteTypeArrayInternal(Lm6/a$a;Ljava/lang/String;Ljava/util/ArrayList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lm6/a;",
            ">(",
            "Lm6/a$a;",
            "Ljava/lang/String;",
            "Ljava/util/ArrayList<",
            "TT;>;)V"
        }
    .end annotation

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string p2, "Concrete type array not supported"

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public addConcreteTypeInternal(Lm6/a$a;Ljava/lang/String;Lm6/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lm6/a;",
            ">(",
            "Lm6/a$a;",
            "Ljava/lang/String;",
            "TT;)V"
        }
    .end annotation

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string p2, "Concrete type not supported"

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public abstract getFieldMappings()Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lm6/a$a<",
            "**>;>;"
        }
    .end annotation
.end method

.method public getFieldValue(Lm6/a$a;)Ljava/lang/Object;
    .locals 5

    iget-object v0, p1, Lm6/a$a;->m:Ljava/lang/String;

    iget-object v1, p1, Lm6/a$a;->o:Ljava/lang/Class;

    if-eqz v1, :cond_1

    invoke-virtual {p0, v0}, Lm6/a;->getValueObject(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    move v1, v3

    :goto_0
    new-array v4, v2, [Ljava/lang/Object;

    iget-object p1, p1, Lm6/a$a;->m:Ljava/lang/String;

    aput-object p1, v4, v3

    const-string p1, "Concrete field shouldn\'t be value object: %s"

    invoke-static {v1, p1, v4}, Lh6/s;->q(ZLjava/lang/String;[Ljava/lang/Object;)V

    :try_start_0
    invoke-virtual {v0, v3}, Ljava/lang/String;->charAt(I)C

    move-result p1

    invoke-static {p1}, Ljava/lang/Character;->toUpperCase(C)C

    move-result p1

    invoke-virtual {v0, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "get"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-array v1, v3, [Ljava/lang/Class;

    invoke-virtual {p1, v0, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object p1

    new-array v0, v3, [Ljava/lang/Object;

    invoke-virtual {p1, p0, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v0

    :cond_1
    invoke-virtual {p0, v0}, Lm6/a;->getValueObject(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public abstract getValueObject(Ljava/lang/String;)Ljava/lang/Object;
.end method

.method public isFieldSet(Lm6/a$a;)Z
    .locals 2

    iget v0, p1, Lm6/a$a;->k:I

    const/16 v1, 0xb

    if-ne v0, v1, :cond_1

    iget-boolean p1, p1, Lm6/a$a;->l:Z

    if-eqz p1, :cond_0

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "Concrete type arrays not supported"

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_0
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "Concrete types not supported"

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object p1, p1, Lm6/a$a;->m:Ljava/lang/String;

    invoke-virtual {p0, p1}, Lm6/a;->isPrimitiveFieldSet(Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public abstract isPrimitiveFieldSet(Ljava/lang/String;)Z
.end method

.method public setBooleanInternal(Lm6/a$a;Ljava/lang/String;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lm6/a$a<",
            "**>;",
            "Ljava/lang/String;",
            "Z)V"
        }
    .end annotation

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string p2, "Boolean not supported"

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setDecodedBytesInternal(Lm6/a$a;Ljava/lang/String;[B)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lm6/a$a<",
            "**>;",
            "Ljava/lang/String;",
            "[B)V"
        }
    .end annotation

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string p2, "byte[] not supported"

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setIntegerInternal(Lm6/a$a;Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lm6/a$a<",
            "**>;",
            "Ljava/lang/String;",
            "I)V"
        }
    .end annotation

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string p2, "Integer not supported"

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setLongInternal(Lm6/a$a;Ljava/lang/String;J)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lm6/a$a<",
            "**>;",
            "Ljava/lang/String;",
            "J)V"
        }
    .end annotation

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string p2, "Long not supported"

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setStringInternal(Lm6/a$a;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lm6/a$a<",
            "**>;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string p2, "String not supported"

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setStringMapInternal(Lm6/a$a;Ljava/lang/String;Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lm6/a$a<",
            "**>;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string p2, "String map not supported"

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setStringsInternal(Lm6/a$a;Ljava/lang/String;Ljava/util/ArrayList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lm6/a$a<",
            "**>;",
            "Ljava/lang/String;",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string p2, "String list not supported"

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public toString()Ljava/lang/String;
    .locals 9

    invoke-virtual {p0}, Lm6/a;->getFieldMappings()Ljava/util/Map;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    const/16 v2, 0x64

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_7

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lm6/a$a;

    invoke-virtual {p0, v4}, Lm6/a;->isFieldSet(Lm6/a$a;)Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-virtual {p0, v4}, Lm6/a;->getFieldValue(Lm6/a$a;)Ljava/lang/Object;

    move-result-object v5

    invoke-static {v4, v5}, Lm6/a;->zaD(Lm6/a$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->length()I

    move-result v6

    const-string v7, ","

    if-nez v6, :cond_1

    const-string v6, "{"

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_1
    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_1
    const-string v6, "\""

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "\":"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-nez v5, :cond_2

    const-string v3, "null"

    :goto_2
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_2
    iget v3, v4, Lm6/a$a;->k:I

    packed-switch v3, :pswitch_data_0

    iget-boolean v3, v4, Lm6/a$a;->j:Z

    if-eqz v3, :cond_6

    check-cast v5, Ljava/util/ArrayList;

    const-string v3, "["

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v3

    const/4 v6, 0x0

    goto :goto_4

    :pswitch_0
    check-cast v5, Ljava/util/HashMap;

    invoke-static {v1, v5}, Lo6/l;->a(Ljava/lang/StringBuilder;Ljava/util/HashMap;)V

    goto :goto_0

    :pswitch_1
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    check-cast v5, [B

    invoke-static {v5}, Lo6/c;->d([B)Ljava/lang/String;

    move-result-object v3

    goto :goto_3

    :pswitch_2
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    check-cast v5, [B

    invoke-static {v5}, Lo6/c;->c([B)Ljava/lang/String;

    move-result-object v3

    :goto_3
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :goto_4
    if-ge v6, v3, :cond_5

    if-lez v6, :cond_3

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_3
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v8

    if-eqz v8, :cond_4

    invoke-static {v1, v4, v8}, Lm6/a;->zaF(Ljava/lang/StringBuilder;Lm6/a$a;Ljava/lang/Object;)V

    :cond_4
    add-int/lit8 v6, v6, 0x1

    goto :goto_4

    :cond_5
    const-string v3, "]"

    goto :goto_2

    :cond_6
    invoke-static {v1, v4, v5}, Lm6/a;->zaF(Ljava/lang/StringBuilder;Lm6/a$a;Ljava/lang/Object;)V

    goto/16 :goto_0

    :cond_7
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    if-lez v0, :cond_8

    const-string v0, "}"

    goto :goto_5

    :cond_8
    const-string v0, "{}"

    :goto_5
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x8
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final zaA(Lm6/a$a;Ljava/lang/String;)V
    .locals 1

    invoke-static {p1}, Lm6/a$a;->Q(Lm6/a$a;)Lm6/a$b;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-direct {p0, p1, p2}, Lm6/a;->zaE(Lm6/a$a;Ljava/lang/Object;)V

    return-void

    :cond_0
    iget-object v0, p1, Lm6/a$a;->m:Ljava/lang/String;

    invoke-virtual {p0, p1, v0, p2}, Lm6/a;->setStringInternal(Lm6/a$a;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final zaB(Lm6/a$a;Ljava/util/Map;)V
    .locals 1

    invoke-static {p1}, Lm6/a$a;->Q(Lm6/a$a;)Lm6/a$b;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-direct {p0, p1, p2}, Lm6/a;->zaE(Lm6/a$a;Ljava/lang/Object;)V

    return-void

    :cond_0
    iget-object v0, p1, Lm6/a$a;->m:Ljava/lang/String;

    invoke-virtual {p0, p1, v0, p2}, Lm6/a;->setStringMapInternal(Lm6/a$a;Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method public final zaC(Lm6/a$a;Ljava/util/ArrayList;)V
    .locals 1

    invoke-static {p1}, Lm6/a$a;->Q(Lm6/a$a;)Lm6/a$b;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-direct {p0, p1, p2}, Lm6/a;->zaE(Lm6/a$a;Ljava/lang/Object;)V

    return-void

    :cond_0
    iget-object v0, p1, Lm6/a$a;->m:Ljava/lang/String;

    invoke-virtual {p0, p1, v0, p2}, Lm6/a;->setStringsInternal(Lm6/a$a;Ljava/lang/String;Ljava/util/ArrayList;)V

    return-void
.end method

.method public final zaa(Lm6/a$a;Ljava/math/BigDecimal;)V
    .locals 1

    invoke-static {p1}, Lm6/a$a;->Q(Lm6/a$a;)Lm6/a$b;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-direct {p0, p1, p2}, Lm6/a;->zaE(Lm6/a$a;Ljava/lang/Object;)V

    return-void

    :cond_0
    iget-object v0, p1, Lm6/a$a;->m:Ljava/lang/String;

    invoke-virtual {p0, p1, v0, p2}, Lm6/a;->zab(Lm6/a$a;Ljava/lang/String;Ljava/math/BigDecimal;)V

    return-void
.end method

.method public zab(Lm6/a$a;Ljava/lang/String;Ljava/math/BigDecimal;)V
    .locals 0

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string p2, "BigDecimal not supported"

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final zac(Lm6/a$a;Ljava/util/ArrayList;)V
    .locals 1

    invoke-static {p1}, Lm6/a$a;->Q(Lm6/a$a;)Lm6/a$b;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-direct {p0, p1, p2}, Lm6/a;->zaE(Lm6/a$a;Ljava/lang/Object;)V

    return-void

    :cond_0
    iget-object v0, p1, Lm6/a$a;->m:Ljava/lang/String;

    invoke-virtual {p0, p1, v0, p2}, Lm6/a;->zad(Lm6/a$a;Ljava/lang/String;Ljava/util/ArrayList;)V

    return-void
.end method

.method public zad(Lm6/a$a;Ljava/lang/String;Ljava/util/ArrayList;)V
    .locals 0

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string p2, "BigDecimal list not supported"

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final zae(Lm6/a$a;Ljava/math/BigInteger;)V
    .locals 1

    invoke-static {p1}, Lm6/a$a;->Q(Lm6/a$a;)Lm6/a$b;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-direct {p0, p1, p2}, Lm6/a;->zaE(Lm6/a$a;Ljava/lang/Object;)V

    return-void

    :cond_0
    iget-object v0, p1, Lm6/a$a;->m:Ljava/lang/String;

    invoke-virtual {p0, p1, v0, p2}, Lm6/a;->zaf(Lm6/a$a;Ljava/lang/String;Ljava/math/BigInteger;)V

    return-void
.end method

.method public zaf(Lm6/a$a;Ljava/lang/String;Ljava/math/BigInteger;)V
    .locals 0

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string p2, "BigInteger not supported"

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final zag(Lm6/a$a;Ljava/util/ArrayList;)V
    .locals 1

    invoke-static {p1}, Lm6/a$a;->Q(Lm6/a$a;)Lm6/a$b;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-direct {p0, p1, p2}, Lm6/a;->zaE(Lm6/a$a;Ljava/lang/Object;)V

    return-void

    :cond_0
    iget-object v0, p1, Lm6/a$a;->m:Ljava/lang/String;

    invoke-virtual {p0, p1, v0, p2}, Lm6/a;->zah(Lm6/a$a;Ljava/lang/String;Ljava/util/ArrayList;)V

    return-void
.end method

.method public zah(Lm6/a$a;Ljava/lang/String;Ljava/util/ArrayList;)V
    .locals 0

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string p2, "BigInteger list not supported"

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final zai(Lm6/a$a;Z)V
    .locals 1

    invoke-static {p1}, Lm6/a$a;->Q(Lm6/a$a;)Lm6/a$b;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    invoke-direct {p0, p1, p2}, Lm6/a;->zaE(Lm6/a$a;Ljava/lang/Object;)V

    return-void

    :cond_0
    iget-object v0, p1, Lm6/a$a;->m:Ljava/lang/String;

    invoke-virtual {p0, p1, v0, p2}, Lm6/a;->setBooleanInternal(Lm6/a$a;Ljava/lang/String;Z)V

    return-void
.end method

.method public final zaj(Lm6/a$a;Ljava/util/ArrayList;)V
    .locals 1

    invoke-static {p1}, Lm6/a$a;->Q(Lm6/a$a;)Lm6/a$b;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-direct {p0, p1, p2}, Lm6/a;->zaE(Lm6/a$a;Ljava/lang/Object;)V

    return-void

    :cond_0
    iget-object v0, p1, Lm6/a$a;->m:Ljava/lang/String;

    invoke-virtual {p0, p1, v0, p2}, Lm6/a;->zak(Lm6/a$a;Ljava/lang/String;Ljava/util/ArrayList;)V

    return-void
.end method

.method public zak(Lm6/a$a;Ljava/lang/String;Ljava/util/ArrayList;)V
    .locals 0

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string p2, "Boolean list not supported"

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final zal(Lm6/a$a;[B)V
    .locals 1

    invoke-static {p1}, Lm6/a$a;->Q(Lm6/a$a;)Lm6/a$b;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-direct {p0, p1, p2}, Lm6/a;->zaE(Lm6/a$a;Ljava/lang/Object;)V

    return-void

    :cond_0
    iget-object v0, p1, Lm6/a$a;->m:Ljava/lang/String;

    invoke-virtual {p0, p1, v0, p2}, Lm6/a;->setDecodedBytesInternal(Lm6/a$a;Ljava/lang/String;[B)V

    return-void
.end method

.method public final zam(Lm6/a$a;D)V
    .locals 1

    invoke-static {p1}, Lm6/a$a;->Q(Lm6/a$a;)Lm6/a$b;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {p2, p3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p2

    invoke-direct {p0, p1, p2}, Lm6/a;->zaE(Lm6/a$a;Ljava/lang/Object;)V

    return-void

    :cond_0
    iget-object v0, p1, Lm6/a$a;->m:Ljava/lang/String;

    invoke-virtual {p0, p1, v0, p2, p3}, Lm6/a;->zan(Lm6/a$a;Ljava/lang/String;D)V

    return-void
.end method

.method public zan(Lm6/a$a;Ljava/lang/String;D)V
    .locals 0

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string p2, "Double not supported"

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final zao(Lm6/a$a;Ljava/util/ArrayList;)V
    .locals 1

    invoke-static {p1}, Lm6/a$a;->Q(Lm6/a$a;)Lm6/a$b;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-direct {p0, p1, p2}, Lm6/a;->zaE(Lm6/a$a;Ljava/lang/Object;)V

    return-void

    :cond_0
    iget-object v0, p1, Lm6/a$a;->m:Ljava/lang/String;

    invoke-virtual {p0, p1, v0, p2}, Lm6/a;->zap(Lm6/a$a;Ljava/lang/String;Ljava/util/ArrayList;)V

    return-void
.end method

.method public zap(Lm6/a$a;Ljava/lang/String;Ljava/util/ArrayList;)V
    .locals 0

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string p2, "Double list not supported"

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final zaq(Lm6/a$a;F)V
    .locals 1

    invoke-static {p1}, Lm6/a$a;->Q(Lm6/a$a;)Lm6/a$b;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p2

    invoke-direct {p0, p1, p2}, Lm6/a;->zaE(Lm6/a$a;Ljava/lang/Object;)V

    return-void

    :cond_0
    iget-object v0, p1, Lm6/a$a;->m:Ljava/lang/String;

    invoke-virtual {p0, p1, v0, p2}, Lm6/a;->zar(Lm6/a$a;Ljava/lang/String;F)V

    return-void
.end method

.method public zar(Lm6/a$a;Ljava/lang/String;F)V
    .locals 0

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string p2, "Float not supported"

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final zas(Lm6/a$a;Ljava/util/ArrayList;)V
    .locals 1

    invoke-static {p1}, Lm6/a$a;->Q(Lm6/a$a;)Lm6/a$b;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-direct {p0, p1, p2}, Lm6/a;->zaE(Lm6/a$a;Ljava/lang/Object;)V

    return-void

    :cond_0
    iget-object v0, p1, Lm6/a$a;->m:Ljava/lang/String;

    invoke-virtual {p0, p1, v0, p2}, Lm6/a;->zat(Lm6/a$a;Ljava/lang/String;Ljava/util/ArrayList;)V

    return-void
.end method

.method public zat(Lm6/a$a;Ljava/lang/String;Ljava/util/ArrayList;)V
    .locals 0

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string p2, "Float list not supported"

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final zau(Lm6/a$a;I)V
    .locals 1

    invoke-static {p1}, Lm6/a$a;->Q(Lm6/a$a;)Lm6/a$b;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-direct {p0, p1, p2}, Lm6/a;->zaE(Lm6/a$a;Ljava/lang/Object;)V

    return-void

    :cond_0
    iget-object v0, p1, Lm6/a$a;->m:Ljava/lang/String;

    invoke-virtual {p0, p1, v0, p2}, Lm6/a;->setIntegerInternal(Lm6/a$a;Ljava/lang/String;I)V

    return-void
.end method

.method public final zav(Lm6/a$a;Ljava/util/ArrayList;)V
    .locals 1

    invoke-static {p1}, Lm6/a$a;->Q(Lm6/a$a;)Lm6/a$b;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-direct {p0, p1, p2}, Lm6/a;->zaE(Lm6/a$a;Ljava/lang/Object;)V

    return-void

    :cond_0
    iget-object v0, p1, Lm6/a$a;->m:Ljava/lang/String;

    invoke-virtual {p0, p1, v0, p2}, Lm6/a;->zaw(Lm6/a$a;Ljava/lang/String;Ljava/util/ArrayList;)V

    return-void
.end method

.method public zaw(Lm6/a$a;Ljava/lang/String;Ljava/util/ArrayList;)V
    .locals 0

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string p2, "Integer list not supported"

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final zax(Lm6/a$a;J)V
    .locals 1

    invoke-static {p1}, Lm6/a$a;->Q(Lm6/a$a;)Lm6/a$b;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    invoke-direct {p0, p1, p2}, Lm6/a;->zaE(Lm6/a$a;Ljava/lang/Object;)V

    return-void

    :cond_0
    iget-object v0, p1, Lm6/a$a;->m:Ljava/lang/String;

    invoke-virtual {p0, p1, v0, p2, p3}, Lm6/a;->setLongInternal(Lm6/a$a;Ljava/lang/String;J)V

    return-void
.end method

.method public final zay(Lm6/a$a;Ljava/util/ArrayList;)V
    .locals 1

    invoke-static {p1}, Lm6/a$a;->Q(Lm6/a$a;)Lm6/a$b;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-direct {p0, p1, p2}, Lm6/a;->zaE(Lm6/a$a;Ljava/lang/Object;)V

    return-void

    :cond_0
    iget-object v0, p1, Lm6/a$a;->m:Ljava/lang/String;

    invoke-virtual {p0, p1, v0, p2}, Lm6/a;->zaz(Lm6/a$a;Ljava/lang/String;Ljava/util/ArrayList;)V

    return-void
.end method

.method public zaz(Lm6/a$a;Ljava/lang/String;Ljava/util/ArrayList;)V
    .locals 0

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string p2, "Long list not supported"

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
