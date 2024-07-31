.class public final Lm9/w$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lm9/w;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final synthetic a:Lm9/w$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lm9/w$a;

    invoke-direct {v0}, Lm9/w$a;-><init>()V

    sput-object v0, Lm9/w$a;->a:Lm9/w$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Lm9/w;
    .locals 2

    sget-object v0, Ln7/c;->a:Ln7/c;

    invoke-static {v0}, Ln7/n;->a(Ln7/c;)Ln7/g;

    move-result-object v0

    const-class v1, Lm9/w;

    invoke-virtual {v0, v1}, Ln7/g;->k(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "Firebase.app[SessionDatastore::class.java]"

    invoke-static {v0, v1}, Ltd/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lm9/w;

    return-object v0
.end method
