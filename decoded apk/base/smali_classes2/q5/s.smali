.class public final synthetic Lq5/s;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic h:Lq5/w$a;

.field public final synthetic i:Lq5/y;


# direct methods
.method public synthetic constructor <init>(Lq5/w$a;Lq5/y;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq5/s;->h:Lq5/w$a;

    iput-object p2, p0, Lq5/s;->i:Lq5/y;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lq5/s;->h:Lq5/w$a;

    iget-object v1, p0, Lq5/s;->i:Lq5/y;

    invoke-static {v0, v1}, Lq5/w$a;->h(Lq5/w$a;Lq5/y;)V

    return-void
.end method
