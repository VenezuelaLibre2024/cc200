.class public final Lv0/x0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lv0/w0;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lv0/y;

    sget-object v0, Lv0/y$f;->k:Lv0/y$f;

    invoke-virtual {p1, v0}, Lv0/y;->u(Lv0/y$f;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
