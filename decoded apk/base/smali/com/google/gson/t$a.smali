.class public final enum Lcom/google/gson/t$a;
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
.method public bridge synthetic b(Ly9/a;)Ljava/lang/Number;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/google/gson/t$a;->c(Ly9/a;)Ljava/lang/Double;

    move-result-object p1

    return-object p1
.end method

.method public c(Ly9/a;)Ljava/lang/Double;
    .locals 2

    invoke-virtual {p1}, Ly9/a;->b0()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    return-object p1
.end method
