.class public final synthetic Lo3/u;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lo3/m0$b;


# static fields
.field public static final synthetic a:Lo3/u;


# direct methods
.method public static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lo3/u;

    invoke-direct {v0}, Lo3/u;-><init>()V

    sput-object v0, Lo3/u;->a:Lo3/u;

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

    invoke-static {p1}, Lo3/m0;->f0(Landroid/database/Cursor;)Ljava/lang/Long;

    move-result-object p1

    return-object p1
.end method
