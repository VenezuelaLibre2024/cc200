.class public final Lg3/e$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lg3/v$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lg3/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public a:Landroid/content/Context;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lg3/e$a;)V
    .locals 0

    invoke-direct {p0}, Lg3/e$b;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lg3/v;
    .locals 3

    iget-object v0, p0, Lg3/e$b;->a:Landroid/content/Context;

    const-class v1, Landroid/content/Context;

    invoke-static {v0, v1}, Li3/d;->a(Ljava/lang/Object;Ljava/lang/Class;)V

    new-instance v0, Lg3/e;

    iget-object v1, p0, Lg3/e$b;->a:Landroid/content/Context;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lg3/e;-><init>(Landroid/content/Context;Lg3/e$a;)V

    return-object v0
.end method

.method public bridge synthetic b(Landroid/content/Context;)Lg3/v$a;
    .locals 0

    invoke-virtual {p0, p1}, Lg3/e$b;->c(Landroid/content/Context;)Lg3/e$b;

    move-result-object p1

    return-object p1
.end method

.method public c(Landroid/content/Context;)Lg3/e$b;
    .locals 0

    invoke-static {p1}, Li3/d;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/Context;

    iput-object p1, p0, Lg3/e$b;->a:Landroid/content/Context;

    return-object p0
.end method
