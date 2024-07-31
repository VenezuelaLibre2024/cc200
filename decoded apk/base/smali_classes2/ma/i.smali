.class public final synthetic Lma/i;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic h:Lma/h$b;

.field public final synthetic i:Z


# direct methods
.method public synthetic constructor <init>(Lma/h$b;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lma/i;->h:Lma/h$b;

    iput-boolean p2, p0, Lma/i;->i:Z

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lma/i;->h:Lma/h$b;

    iget-boolean v1, p0, Lma/i;->i:Z

    invoke-static {v0, v1}, Lma/h$b;->a(Lma/h$b;Z)V

    return-void
.end method
