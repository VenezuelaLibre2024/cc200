.class public final synthetic La5/d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic h:La5/c$c;

.field public final synthetic i:Landroid/net/Uri;


# direct methods
.method public synthetic constructor <init>(La5/c$c;Landroid/net/Uri;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La5/d;->h:La5/c$c;

    iput-object p2, p0, La5/d;->i:Landroid/net/Uri;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, La5/d;->h:La5/c$c;

    iget-object v1, p0, La5/d;->i:Landroid/net/Uri;

    invoke-static {v0, v1}, La5/c$c;->a(La5/c$c;Landroid/net/Uri;)V

    return-void
.end method
