.class public final Lm9/x$d;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lm9/x;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "d"
.end annotation


# static fields
.field public static final a:Lm9/x$d;

.field public static final b:Lu0/d$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lu0/d$a<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lm9/x$d;

    invoke-direct {v0}, Lm9/x$d;-><init>()V

    sput-object v0, Lm9/x$d;->a:Lm9/x$d;

    const-string v0, "session_id"

    invoke-static {v0}, Lu0/f;->f(Ljava/lang/String;)Lu0/d$a;

    move-result-object v0

    sput-object v0, Lm9/x$d;->b:Lu0/d$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Lu0/d$a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lu0/d$a<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    sget-object v0, Lm9/x$d;->b:Lu0/d$a;

    return-object v0
.end method
