.class public Ld8/c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ld8/b;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ld8/a;)V
    .locals 1

    invoke-static {}, Lb8/g;->f()Lb8/g;

    move-result-object p1

    const-string v0, "Could not register handler for breadcrumbs events."

    invoke-virtual {p1, v0}, Lb8/g;->b(Ljava/lang/String;)V

    return-void
.end method
