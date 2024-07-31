.class public final Lm9/g0$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lm9/g0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final synthetic a:Lm9/g0$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lm9/g0$a;

    invoke-direct {v0}, Lm9/g0$a;-><init>()V

    sput-object v0, Lm9/g0$a;->a:Lm9/g0$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Lm9/g0;
    .locals 2

    sget-object v0, Ln7/c;->a:Ln7/c;

    invoke-static {v0}, Ln7/n;->a(Ln7/c;)Ln7/g;

    move-result-object v0

    const-class v1, Lm9/g0;

    invoke-virtual {v0, v1}, Ln7/g;->k(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "Firebase.app[SessionLife\u2026erviceBinder::class.java]"

    invoke-static {v0, v1}, Ltd/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lm9/g0;

    return-object v0
.end method
