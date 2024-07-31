.class public final synthetic La1/b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic h:La1/d$c;

.field public final synthetic i:La1/n;


# direct methods
.method public synthetic constructor <init>(La1/d$c;La1/n;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La1/b;->h:La1/d$c;

    iput-object p2, p0, La1/b;->i:La1/n;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, La1/b;->h:La1/d$c;

    iget-object v1, p0, La1/b;->i:La1/n;

    invoke-static {v0, v1}, La1/d;->a(La1/d$c;La1/n;)V

    return-void
.end method
