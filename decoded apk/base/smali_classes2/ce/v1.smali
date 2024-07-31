.class public final Lce/v1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lce/p0;


# static fields
.field public static final h:Lce/v1;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lce/v1;

    invoke-direct {v0}, Lce/v1;-><init>()V

    sput-object v0, Lce/v1;->h:Lce/v1;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b()Ljd/g;
    .locals 1

    sget-object v0, Ljd/h;->h:Ljd/h;

    return-object v0
.end method
