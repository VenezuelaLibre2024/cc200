.class public final Lgd/s;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final a:Lgd/s;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lgd/s;

    invoke-direct {v0}, Lgd/s;-><init>()V

    sput-object v0, Lgd/s;->a:Lgd/s;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, "kotlin.Unit"

    return-object v0
.end method
