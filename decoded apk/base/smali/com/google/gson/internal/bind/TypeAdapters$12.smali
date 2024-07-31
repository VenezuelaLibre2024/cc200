.class Lcom/google/gson/internal/bind/TypeAdapters$12;
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
        "Ljava/lang/Number;",
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
.method public a(Ly9/a;)Ljava/lang/Number;
    .locals 2

    invoke-virtual {p1}, Ly9/a;->r0()Ly9/b;

    move-result-object v0

    sget-object v1, Ly9/b;->p:Ly9/b;

    if-ne v0, v1, :cond_0

    invoke-virtual {p1}, Ly9/a;->h0()V

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-virtual {p1}, Ly9/a;->b0()D

    move-result-wide v0

    double-to-float p1, v0

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    return-object p1
.end method

.method public b(Ly9/c;Ljava/lang/Number;)V
    .locals 0

    invoke-virtual {p1, p2}, Ly9/c;->u0(Ljava/lang/Number;)Ly9/c;

    return-void
.end method

.method public bridge synthetic read(Ly9/a;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/google/gson/internal/bind/TypeAdapters$12;->a(Ly9/a;)Ljava/lang/Number;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic write(Ly9/c;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p0, p1, p2}, Lcom/google/gson/internal/bind/TypeAdapters$12;->b(Ly9/c;Ljava/lang/Number;)V

    return-void
.end method
