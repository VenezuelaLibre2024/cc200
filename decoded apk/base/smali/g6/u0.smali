.class public final synthetic Lg6/u0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic h:Lg6/j;

.field public final synthetic i:Lg6/j$b;


# direct methods
.method public synthetic constructor <init>(Lg6/j;Lg6/j$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg6/u0;->h:Lg6/j;

    iput-object p2, p0, Lg6/u0;->i:Lg6/j$b;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lg6/u0;->h:Lg6/j;

    iget-object v1, p0, Lg6/u0;->i:Lg6/j$b;

    invoke-virtual {v0, v1}, Lg6/j;->d(Lg6/j$b;)V

    return-void
.end method
