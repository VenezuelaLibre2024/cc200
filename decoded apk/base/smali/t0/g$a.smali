.class public final Lt0/g$a;
.super Lv0/y$a;
.source ""

# interfaces
.implements Lv0/s0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lt0/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lv0/y$a<",
        "Lt0/g;",
        "Lt0/g$a;",
        ">;",
        "Lv0/s0;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-static {}, Lt0/g;->L()Lt0/g;

    move-result-object v0

    invoke-direct {p0, v0}, Lv0/y$a;-><init>(Lv0/y;)V

    return-void
.end method

.method public synthetic constructor <init>(Lt0/e;)V
    .locals 0

    invoke-direct {p0}, Lt0/g$a;-><init>()V

    return-void
.end method


# virtual methods
.method public y(Ljava/lang/Iterable;)Lt0/g$a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Iterable<",
            "Ljava/lang/String;",
            ">;)",
            "Lt0/g$a;"
        }
    .end annotation

    invoke-virtual {p0}, Lv0/y$a;->t()V

    iget-object v0, p0, Lv0/y$a;->i:Lv0/y;

    check-cast v0, Lt0/g;

    invoke-static {v0, p1}, Lt0/g;->M(Lt0/g;Ljava/lang/Iterable;)V

    return-object p0
.end method
