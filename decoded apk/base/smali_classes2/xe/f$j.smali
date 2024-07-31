.class public abstract Lxe/f$j;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lxe/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "j"
.end annotation


# static fields
.field public static final a:Lxe/f$j;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lxe/f$j$a;

    invoke-direct {v0}, Lxe/f$j$a;-><init>()V

    sput-object v0, Lxe/f$j;->a:Lxe/f$j;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lxe/f;)V
    .locals 0

    return-void
.end method

.method public abstract b(Lxe/i;)V
.end method
