.class public final synthetic Lo3/s;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lo3/m0$b;


# static fields
.field public static final synthetic a:Lo3/s;


# direct methods
.method public static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lo3/s;

    invoke-direct {v0}, Lo3/s;-><init>()V

    sput-object v0, Lo3/s;->a:Lo3/s;

    return-void
.end method

.method public synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroid/database/Cursor;

    invoke-static {p1}, Lo3/m0;->K(Landroid/database/Cursor;)[B

    move-result-object p1

    return-object p1
.end method