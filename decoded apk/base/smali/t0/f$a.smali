.class public final Lt0/f$a;
.super Lv0/y$a;
.source ""

# interfaces
.implements Lv0/s0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lt0/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lv0/y$a<",
        "Lt0/f;",
        "Lt0/f$a;",
        ">;",
        "Lv0/s0;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-static {}, Lt0/f;->L()Lt0/f;

    move-result-object v0

    invoke-direct {p0, v0}, Lv0/y$a;-><init>(Lv0/y;)V

    return-void
.end method

.method public synthetic constructor <init>(Lt0/e;)V
    .locals 0

    invoke-direct {p0}, Lt0/f$a;-><init>()V

    return-void
.end method


# virtual methods
.method public y(Ljava/lang/String;Lt0/h;)Lt0/f$a;
    .locals 1

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lv0/y$a;->t()V

    iget-object v0, p0, Lv0/y$a;->i:Lv0/y;

    check-cast v0, Lt0/f;

    invoke-static {v0}, Lt0/f;->M(Lt0/f;)Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p0
.end method
