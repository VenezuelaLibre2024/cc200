.class public final Lgb/f;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Lgb/d;

.field public final b:Lgb/d;

.field public final c:Lgb/d;


# direct methods
.method public constructor <init>([Lgb/d;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    aget-object v0, p1, v0

    iput-object v0, p0, Lgb/f;->a:Lgb/d;

    const/4 v0, 0x1

    aget-object v0, p1, v0

    iput-object v0, p0, Lgb/f;->b:Lgb/d;

    const/4 v0, 0x2

    aget-object p1, p1, v0

    iput-object p1, p0, Lgb/f;->c:Lgb/d;

    return-void
.end method


# virtual methods
.method public a()Lgb/d;
    .locals 1

    iget-object v0, p0, Lgb/f;->a:Lgb/d;

    return-object v0
.end method

.method public b()Lgb/d;
    .locals 1

    iget-object v0, p0, Lgb/f;->b:Lgb/d;

    return-object v0
.end method

.method public c()Lgb/d;
    .locals 1

    iget-object v0, p0, Lgb/f;->c:Lgb/d;

    return-object v0
.end method
