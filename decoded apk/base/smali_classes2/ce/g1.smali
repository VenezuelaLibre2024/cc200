.class public final Lce/g1;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final a:Lce/g1;

.field public static final b:Lce/k0;

.field public static final c:Lce/k0;

.field public static final d:Lce/k0;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lce/g1;

    invoke-direct {v0}, Lce/g1;-><init>()V

    sput-object v0, Lce/g1;->a:Lce/g1;

    sget-object v0, Lje/c;->p:Lje/c;

    sput-object v0, Lce/g1;->b:Lce/k0;

    sget-object v0, Lce/g3;->j:Lce/g3;

    sput-object v0, Lce/g1;->c:Lce/k0;

    sget-object v0, Lje/b;->k:Lje/b;

    sput-object v0, Lce/g1;->d:Lce/k0;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final a()Lce/k0;
    .locals 1

    sget-object v0, Lce/g1;->b:Lce/k0;

    return-object v0
.end method

.method public static final b()Lce/k0;
    .locals 1

    sget-object v0, Lce/g1;->d:Lce/k0;

    return-object v0
.end method

.method public static final c()Lce/n2;
    .locals 1

    sget-object v0, Lhe/a0;->c:Lce/n2;

    return-object v0
.end method
