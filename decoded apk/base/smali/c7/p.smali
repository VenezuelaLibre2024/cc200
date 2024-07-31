.class public final synthetic Lc7/p;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lc7/t;


# static fields
.field public static final synthetic a:Lc7/p;


# direct methods
.method public static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lc7/p;

    invoke-direct {v0}, Lc7/p;-><init>()V

    sput-object v0, Lc7/p;->a:Lc7/p;

    return-void
.end method

.method public synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/database/Cursor;)Ljava/lang/Object;
    .locals 0

    invoke-static {p1}, Lc7/m;->F(Landroid/database/Cursor;)Lc7/n7;

    move-result-object p1

    return-object p1
.end method
