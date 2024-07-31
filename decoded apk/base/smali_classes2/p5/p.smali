.class public final synthetic Lp5/p;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic h:Ljava/util/concurrent/CopyOnWriteArraySet;

.field public final synthetic i:I

.field public final synthetic j:Lp5/q$a;


# direct methods
.method public synthetic constructor <init>(Ljava/util/concurrent/CopyOnWriteArraySet;ILp5/q$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp5/p;->h:Ljava/util/concurrent/CopyOnWriteArraySet;

    iput p2, p0, Lp5/p;->i:I

    iput-object p3, p0, Lp5/p;->j:Lp5/q$a;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lp5/p;->h:Ljava/util/concurrent/CopyOnWriteArraySet;

    iget v1, p0, Lp5/p;->i:I

    iget-object v2, p0, Lp5/p;->j:Lp5/q$a;

    invoke-static {v0, v1, v2}, Lp5/q;->a(Ljava/util/concurrent/CopyOnWriteArraySet;ILp5/q$a;)V

    return-void
.end method
