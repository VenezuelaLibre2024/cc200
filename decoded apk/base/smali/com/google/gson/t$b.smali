.class public final enum Lcom/google/gson/t$b;
.super Lcom/google/gson/t;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/gson/t;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4011
    name = null
.end annotation


# direct methods
.method public constructor <init>(Ljava/lang/String;I)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/google/gson/t;-><init>(Ljava/lang/String;ILcom/google/gson/t$a;)V

    return-void
.end method


# virtual methods
.method public b(Ly9/a;)Ljava/lang/Number;
    .locals 1

    new-instance v0, Lcom/google/gson/internal/f;

    invoke-virtual {p1}, Ly9/a;->l0()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/google/gson/internal/f;-><init>(Ljava/lang/String;)V

    return-object v0
.end method
