.class public final Lm9/d0$b;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lm9/d0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ltd/g;)V
    .locals 0

    invoke-direct {p0}, Lm9/d0$b;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Lm9/d0;
    .locals 2

    sget-object v0, Ln7/c;->a:Ln7/c;

    invoke-static {v0}, Ln7/n;->a(Ln7/c;)Ln7/g;

    move-result-object v0

    const-class v1, Lm9/d0;

    invoke-virtual {v0, v1}, Ln7/g;->k(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "Firebase.app[SessionGenerator::class.java]"

    invoke-static {v0, v1}, Ltd/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lm9/d0;

    return-object v0
.end method
