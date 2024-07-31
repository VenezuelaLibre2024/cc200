.class public final Lg6/j1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic h:Le7/l;

.field public final synthetic i:Lg6/l1;


# direct methods
.method public constructor <init>(Lg6/l1;Le7/l;)V
    .locals 0

    iput-object p1, p0, Lg6/j1;->i:Lg6/l1;

    iput-object p2, p0, Lg6/j1;->h:Le7/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lg6/j1;->i:Lg6/l1;

    iget-object v1, p0, Lg6/j1;->h:Le7/l;

    invoke-static {v0, v1}, Lg6/l1;->N1(Lg6/l1;Le7/l;)V

    return-void
.end method
