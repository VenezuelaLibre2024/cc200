.class public final synthetic Lg9/n;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic h:Lg9/o;

.field public final synthetic i:Landroid/content/Intent;


# direct methods
.method public synthetic constructor <init>(Lg9/o;Landroid/content/Intent;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg9/n;->h:Lg9/o;

    iput-object p2, p0, Lg9/n;->i:Landroid/content/Intent;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lg9/n;->h:Lg9/o;

    iget-object v1, p0, Lg9/n;->i:Landroid/content/Intent;

    invoke-static {v0, v1}, Lg9/o;->a(Lg9/o;Landroid/content/Intent;)V

    return-void
.end method
