.class public final synthetic Lp5/x;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic h:Lp5/y;

.field public final synthetic i:Lp5/y$c;


# direct methods
.method public synthetic constructor <init>(Lp5/y;Lp5/y$c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp5/x;->h:Lp5/y;

    iput-object p2, p0, Lp5/x;->i:Lp5/y$c;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lp5/x;->h:Lp5/y;

    iget-object v1, p0, Lp5/x;->i:Lp5/y$c;

    invoke-static {v0, v1}, Lp5/y;->a(Lp5/y;Lp5/y$c;)V

    return-void
.end method
