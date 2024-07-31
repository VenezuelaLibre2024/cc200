.class public final Ltd/h;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final a:Ltd/h;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Ltd/h;

    invoke-direct {v0}, Ltd/h;-><init>()V

    sput-object v0, Ltd/h;->a:Ltd/h;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()F
    .locals 1

    const v0, 0x7f7fffff    # Float.MAX_VALUE

    return v0
.end method
