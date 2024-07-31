.class public final synthetic Lu4/v;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic h:Lu4/a0$a;

.field public final synthetic i:Lu4/a0;

.field public final synthetic j:Lu4/n;

.field public final synthetic k:Lu4/q;


# direct methods
.method public synthetic constructor <init>(Lu4/a0$a;Lu4/a0;Lu4/n;Lu4/q;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu4/v;->h:Lu4/a0$a;

    iput-object p2, p0, Lu4/v;->i:Lu4/a0;

    iput-object p3, p0, Lu4/v;->j:Lu4/n;

    iput-object p4, p0, Lu4/v;->k:Lu4/q;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lu4/v;->h:Lu4/a0$a;

    iget-object v1, p0, Lu4/v;->i:Lu4/a0;

    iget-object v2, p0, Lu4/v;->j:Lu4/n;

    iget-object v3, p0, Lu4/v;->k:Lu4/q;

    invoke-static {v0, v1, v2, v3}, Lu4/a0$a;->e(Lu4/a0$a;Lu4/a0;Lu4/n;Lu4/q;)V

    return-void
.end method
