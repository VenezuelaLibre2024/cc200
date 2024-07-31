.class public final synthetic Lib/b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic h:Lib/a$b;


# direct methods
.method public synthetic constructor <init>(Lib/a$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lib/b;->h:Lib/a$b;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lib/b;->h:Lib/a$b;

    invoke-static {v0}, Lib/a$b;->a(Lib/a$b;)V

    return-void
.end method
