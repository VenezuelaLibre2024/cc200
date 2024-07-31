.class Lcom/google/gson/internal/bind/TypeAdapters$27;
.super Lcom/google/gson/TypeAdapter;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/gson/internal/bind/TypeAdapters;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/gson/TypeAdapter<",
        "Lcom/google/gson/j;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/gson/TypeAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ly9/a;)Lcom/google/gson/j;
    .locals 3

    instance-of v0, p1, Lcom/google/gson/internal/bind/a;

    if-eqz v0, :cond_0

    check-cast p1, Lcom/google/gson/internal/bind/a;

    invoke-virtual {p1}, Lcom/google/gson/internal/bind/a;->M0()Lcom/google/gson/j;

    move-result-object p1

    return-object p1

    :cond_0
    sget-object v0, Lcom/google/gson/internal/bind/TypeAdapters$a;->a:[I

    invoke-virtual {p1}, Ly9/a;->r0()Ly9/b;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1

    :pswitch_0
    new-instance v0, Lcom/google/gson/m;

    invoke-direct {v0}, Lcom/google/gson/m;-><init>()V

    invoke-virtual {p1}, Ly9/a;->d()V

    :goto_0
    invoke-virtual {p1}, Ly9/a;->E()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p1}, Ly9/a;->f0()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, p1}, Lcom/google/gson/internal/bind/TypeAdapters$27;->a(Ly9/a;)Lcom/google/gson/j;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/gson/m;->n(Ljava/lang/String;Lcom/google/gson/j;)V

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Ly9/a;->w()V

    return-object v0

    :pswitch_1
    new-instance v0, Lcom/google/gson/g;

    invoke-direct {v0}, Lcom/google/gson/g;-><init>()V

    invoke-virtual {p1}, Ly9/a;->a()V

    :goto_1
    invoke-virtual {p1}, Ly9/a;->E()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {p0, p1}, Lcom/google/gson/internal/bind/TypeAdapters$27;->a(Ly9/a;)Lcom/google/gson/j;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/gson/g;->n(Lcom/google/gson/j;)V

    goto :goto_1

    :cond_2
    invoke-virtual {p1}, Ly9/a;->n()V

    return-object v0

    :pswitch_2
    invoke-virtual {p1}, Ly9/a;->h0()V

    sget-object p1, Lcom/google/gson/l;->a:Lcom/google/gson/l;

    return-object p1

    :pswitch_3
    new-instance v0, Lcom/google/gson/o;

    invoke-virtual {p1}, Ly9/a;->l0()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/google/gson/o;-><init>(Ljava/lang/String;)V

    return-object v0

    :pswitch_4
    new-instance v0, Lcom/google/gson/o;

    invoke-virtual {p1}, Ly9/a;->W()Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/google/gson/o;-><init>(Ljava/lang/Boolean;)V

    return-object v0

    :pswitch_5
    invoke-virtual {p1}, Ly9/a;->l0()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Lcom/google/gson/o;

    new-instance v1, Lcom/google/gson/internal/f;

    invoke-direct {v1, p1}, Lcom/google/gson/internal/f;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v1}, Lcom/google/gson/o;-><init>(Ljava/lang/Number;)V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public b(Ly9/c;Lcom/google/gson/j;)V
    .locals 2

    if-eqz p2, :cond_8

    invoke-virtual {p2}, Lcom/google/gson/j;->j()Z

    move-result v0

    if-eqz v0, :cond_0

    goto/16 :goto_2

    :cond_0
    invoke-virtual {p2}, Lcom/google/gson/j;->m()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p2}, Lcom/google/gson/j;->d()Lcom/google/gson/o;

    move-result-object p2

    invoke-virtual {p2}, Lcom/google/gson/o;->u()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p2}, Lcom/google/gson/o;->q()Ljava/lang/Number;

    move-result-object p2

    invoke-virtual {p1, p2}, Ly9/c;->u0(Ljava/lang/Number;)Ly9/c;

    goto/16 :goto_3

    :cond_1
    invoke-virtual {p2}, Lcom/google/gson/o;->s()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p2}, Lcom/google/gson/o;->a()Z

    move-result p2

    invoke-virtual {p1, p2}, Ly9/c;->x0(Z)Ly9/c;

    goto/16 :goto_3

    :cond_2
    invoke-virtual {p2}, Lcom/google/gson/o;->e()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ly9/c;->v0(Ljava/lang/String;)Ly9/c;

    goto/16 :goto_3

    :cond_3
    invoke-virtual {p2}, Lcom/google/gson/j;->h()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual {p1}, Ly9/c;->f()Ly9/c;

    invoke-virtual {p2}, Lcom/google/gson/j;->b()Lcom/google/gson/g;

    move-result-object p2

    invoke-virtual {p2}, Lcom/google/gson/g;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/gson/j;

    invoke-virtual {p0, p1, v0}, Lcom/google/gson/internal/bind/TypeAdapters$27;->b(Ly9/c;Lcom/google/gson/j;)V

    goto :goto_0

    :cond_4
    invoke-virtual {p1}, Ly9/c;->n()Ly9/c;

    goto :goto_3

    :cond_5
    invoke-virtual {p2}, Lcom/google/gson/j;->k()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-virtual {p1}, Ly9/c;->j()Ly9/c;

    invoke-virtual {p2}, Lcom/google/gson/j;->c()Lcom/google/gson/m;

    move-result-object p2

    invoke-virtual {p2}, Lcom/google/gson/m;->o()Ljava/util/Set;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {p1, v1}, Ly9/c;->K(Ljava/lang/String;)Ly9/c;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/gson/j;

    invoke-virtual {p0, p1, v0}, Lcom/google/gson/internal/bind/TypeAdapters$27;->b(Ly9/c;Lcom/google/gson/j;)V

    goto :goto_1

    :cond_6
    invoke-virtual {p1}, Ly9/c;->w()Ly9/c;

    goto :goto_3

    :cond_7
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Couldn\'t write "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p2

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_8
    :goto_2
    invoke-virtual {p1}, Ly9/c;->W()Ly9/c;

    :goto_3
    return-void
.end method

.method public bridge synthetic read(Ly9/a;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/google/gson/internal/bind/TypeAdapters$27;->a(Ly9/a;)Lcom/google/gson/j;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic write(Ly9/c;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Lcom/google/gson/j;

    invoke-virtual {p0, p1, p2}, Lcom/google/gson/internal/bind/TypeAdapters$27;->b(Ly9/c;Lcom/google/gson/j;)V

    return-void
.end method
