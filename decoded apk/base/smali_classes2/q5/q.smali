.class public final synthetic Lq5/q;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic h:Lq5/w$a;

.field public final synthetic i:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lq5/w$a;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq5/q;->h:Lq5/w$a;

    iput-object p2, p0, Lq5/q;->i:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lq5/q;->h:Lq5/w$a;

    iget-object v1, p0, Lq5/q;->i:Ljava/lang/String;

    invoke-static {v0, v1}, Lq5/w$a;->b(Lq5/w$a;Ljava/lang/String;)V

    return-void
.end method
