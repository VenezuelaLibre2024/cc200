.class public final Lr1/c$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lr1/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ltd/g;)V
    .locals 0

    invoke-direct {p0}, Lr1/c$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lr1/d;)Lr1/c;
    .locals 2

    const-string v0, "owner"

    invoke-static {p1, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lr1/c;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lr1/c;-><init>(Lr1/d;Ltd/g;)V

    return-object v0
.end method
