.class public final synthetic Lg6/x0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic h:Lg6/l;


# direct methods
.method public synthetic constructor <init>(Lg6/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg6/x0;->h:Lg6/l;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lg6/x0;->h:Lg6/l;

    invoke-virtual {v0}, Lg6/l;->b()V

    return-void
.end method
