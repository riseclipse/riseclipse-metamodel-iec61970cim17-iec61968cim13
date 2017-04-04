/**
 *  Copyright (c) 2016 CentraleSupélec & EDF.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 *  This file is part of the RiseClipse tool
 *  
 *  Contributors:
 *      Computer Science Department, CentraleSupélec : initial implementation
 *  Contacts:
 *      Dominique.Marcadet@centralesupelec.fr
 * 
 */
package fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Unit Symbol</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getUnitSymbol()
 * @model
 * @generated
 */
public enum UnitSymbol implements Enumerator {
    /**
     * The '<em><b>None</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #NONE_VALUE
     * @generated
     * @ordered
     */
    NONE( 0, "none", "none" ),

    /**
     * The '<em><b>Milli</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #MILLI_VALUE
     * @generated
     * @ordered
     */
    MILLI( 1, "milli", "milli" ),

    /**
     * The '<em><b>Kg</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #KG_VALUE
     * @generated
     * @ordered
     */
    KG( 2, "kg", "kg" ),

    /**
     * The '<em><b>S</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #S_VALUE
     * @generated
     * @ordered
     */
    S( 3, "s", "s" ),

    /**
     * The '<em><b>A</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #A_VALUE
     * @generated
     * @ordered
     */
    A( 4, "A", "A" ),

    /**
     * The '<em><b>K</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #K_VALUE
     * @generated
     * @ordered
     */
    K( 5, "K", "K" ),

    /**
     * The '<em><b>Mol</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #MOL_VALUE
     * @generated
     * @ordered
     */
    MOL( 6, "mol", "mol" ),

    /**
     * The '<em><b>Cd</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #CD_VALUE
     * @generated
     * @ordered
     */
    CD( 7, "cd", "cd" ),

    /**
     * The '<em><b>Deg</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #DEG_VALUE
     * @generated
     * @ordered
     */
    DEG( 8, "deg", "deg" ),

    /**
     * The '<em><b>Rad</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #RAD_VALUE
     * @generated
     * @ordered
     */
    RAD( 9, "rad", "rad" ),

    /**
     * The '<em><b>Sr</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SR_VALUE
     * @generated
     * @ordered
     */
    SR( 10, "sr", "sr" ),

    /**
     * The '<em><b>Gy</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #GY_VALUE
     * @generated
     * @ordered
     */
    GY( 11, "Gy", "Gy" ),

    /**
     * The '<em><b>Bq</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #BQ_VALUE
     * @generated
     * @ordered
     */
    BQ( 12, "Bq", "Bq" ),

    /**
     * The '<em><b>Deg C</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #DEG_C_VALUE
     * @generated
     * @ordered
     */
    DEG_C( 13, "degC", "degC" ),

    /**
     * The '<em><b>Sv</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SV_VALUE
     * @generated
     * @ordered
     */
    SV( 14, "Sv", "Sv" ),

    /**
     * The '<em><b>F</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #F_VALUE
     * @generated
     * @ordered
     */
    F( 15, "F", "F" ),

    /**
     * The '<em><b>C</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #C_VALUE
     * @generated
     * @ordered
     */
    C( 16, "C", "C" ),

    /**
     * The '<em><b>Siemens</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SIEMENS_VALUE
     * @generated
     * @ordered
     */
    SIEMENS( 17, "Siemens", "Siemens" ),

    /**
     * The '<em><b>Henri</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #HENRI_VALUE
     * @generated
     * @ordered
     */
    HENRI( 18, "Henri", "Henri" ),

    /**
     * The '<em><b>V</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #V_VALUE
     * @generated
     * @ordered
     */
    V( 19, "V", "V" ),

    /**
     * The '<em><b>Ohm</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #OHM_VALUE
     * @generated
     * @ordered
     */
    OHM( 20, "ohm", "ohm" ),

    /**
     * The '<em><b>J</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #J_VALUE
     * @generated
     * @ordered
     */
    J( 21, "J", "J" ),

    /**
     * The '<em><b>N</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #N_VALUE
     * @generated
     * @ordered
     */
    N( 22, "N", "N" ),

    /**
     * The '<em><b>Hz</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #HZ_VALUE
     * @generated
     * @ordered
     */
    HZ( 23, "Hz", "Hz" ),

    /**
     * The '<em><b>Lx</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #LX_VALUE
     * @generated
     * @ordered
     */
    LX( 24, "lx", "lx" ),

    /**
     * The '<em><b>Lm</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #LM_VALUE
     * @generated
     * @ordered
     */
    LM( 25, "lm", "lm" ),

    /**
     * The '<em><b>Wb</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #WB_VALUE
     * @generated
     * @ordered
     */
    WB( 26, "Wb", "Wb" ),

    /**
     * The '<em><b>T</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #T_VALUE
     * @generated
     * @ordered
     */
    T( 27, "T", "T" ),

    /**
     * The '<em><b>W</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #W_VALUE
     * @generated
     * @ordered
     */
    W( 28, "W", "W" ),

    /**
     * The '<em><b>Pa</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #PA_VALUE
     * @generated
     * @ordered
     */
    PA( 29, "Pa", "Pa" ),

    /**
     * The '<em><b>M2</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #M2_VALUE
     * @generated
     * @ordered
     */
    M2( 30, "m2", "m2" ),

    /**
     * The '<em><b>M3</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #M3_VALUE
     * @generated
     * @ordered
     */
    M3( 31, "m3", "m3" ),

    /**
     * The '<em><b>MPers</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #MPERS_VALUE
     * @generated
     * @ordered
     */
    MPERS( 32, "mPers", "mPers" ),

    /**
     * The '<em><b>MPers2</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #MPERS2_VALUE
     * @generated
     * @ordered
     */
    MPERS2( 33, "mPers2", "mPers2" ),

    /**
     * The '<em><b>M3 Pers</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #M3_PERS_VALUE
     * @generated
     * @ordered
     */
    M3_PERS( 34, "m3Pers", "m3Pers" ),

    /**
     * The '<em><b>MPerm3</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #MPERM3_VALUE
     * @generated
     * @ordered
     */
    MPERM3( 35, "mPerm3", "mPerm3" ),

    /**
     * The '<em><b>Kgm</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #KGM_VALUE
     * @generated
     * @ordered
     */
    KGM( 36, "kgm", "kgm" ),

    /**
     * The '<em><b>Kg Perm3</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #KG_PERM3_VALUE
     * @generated
     * @ordered
     */
    KG_PERM3( 37, "kgPerm3", "kgPerm3" ),

    /**
     * The '<em><b>WPerm K</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #WPERM_K_VALUE
     * @generated
     * @ordered
     */
    WPERM_K( 38, "WPermK", "WPermK" ),

    /**
     * The '<em><b>JPer K</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #JPER_K_VALUE
     * @generated
     * @ordered
     */
    JPER_K( 39, "JPerK", "JPerK" ),

    /**
     * The '<em><b>Ppm</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #PPM_VALUE
     * @generated
     * @ordered
     */
    PPM( 40, "ppm", "ppm" ),

    /**
     * The '<em><b>Rot Pers</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #ROT_PERS_VALUE
     * @generated
     * @ordered
     */
    ROT_PERS( 41, "rotPers", "rotPers" ),

    /**
     * The '<em><b>Rad Pers</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #RAD_PERS_VALUE
     * @generated
     * @ordered
     */
    RAD_PERS( 42, "radPers", "radPers" ),

    /**
     * The '<em><b>VA</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #VA_VALUE
     * @generated
     * @ordered
     */
    VA( 43, "VA", "VA" ),

    /**
     * The '<em><b>VAr</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #VAR_VALUE
     * @generated
     * @ordered
     */
    VAR( 44, "VAr", "VAr" ),

    /**
     * The '<em><b>Cos Phi</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #COS_PHI_VALUE
     * @generated
     * @ordered
     */
    COS_PHI( 45, "cosPhi", "cosPhi" ),

    /**
     * The '<em><b>Vs</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #VS_VALUE
     * @generated
     * @ordered
     */
    VS( 46, "Vs", "Vs" ),

    /**
     * The '<em><b>V2</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #V2_VALUE
     * @generated
     * @ordered
     */
    V2( 47, "V2", "V2" ),

    /**
     * The '<em><b>As</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #AS_VALUE
     * @generated
     * @ordered
     */
    AS( 48, "As", "As" ),

    /**
     * The '<em><b>A2</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #A2_VALUE
     * @generated
     * @ordered
     */
    A2( 49, "A2", "A2" ),

    /**
     * The '<em><b>A2s</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #A2S_VALUE
     * @generated
     * @ordered
     */
    A2S( 50, "A2s", "A2s" ),

    /**
     * The '<em><b>VAh</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #VAH_VALUE
     * @generated
     * @ordered
     */
    VAH( 51, "VAh", "VAh" ),

    /**
     * The '<em><b>Wh</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #WH_VALUE
     * @generated
     * @ordered
     */
    WH( 52, "Wh", "Wh" ),

    /**
     * The '<em><b>VArh</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #VARH_VALUE
     * @generated
     * @ordered
     */
    VARH( 53, "VArh", "VArh" ),

    /**
     * The '<em><b>VPer Hz</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #VPER_HZ_VALUE
     * @generated
     * @ordered
     */
    VPER_HZ( 54, "VPerHz", "VPerHz" ),

    /**
     * The '<em><b>Hz Pers</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #HZ_PERS_VALUE
     * @generated
     * @ordered
     */
    HZ_PERS( 55, "HzPers", "HzPers" ),

    /**
     * The '<em><b>Character</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #CHARACTER_VALUE
     * @generated
     * @ordered
     */
    CHARACTER( 56, "character", "character" ),

    /**
     * The '<em><b>Char Pers</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #CHAR_PERS_VALUE
     * @generated
     * @ordered
     */
    CHAR_PERS( 57, "charPers", "charPers" ),

    /**
     * The '<em><b>Kgm2</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #KGM2_VALUE
     * @generated
     * @ordered
     */
    KGM2( 58, "kgm2", "kgm2" ),

    /**
     * The '<em><b>DB</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #DB_VALUE
     * @generated
     * @ordered
     */
    DB( 59, "dB", "dB" ),

    /**
     * The '<em><b>WPers</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #WPERS_VALUE
     * @generated
     * @ordered
     */
    WPERS( 60, "WPers", "WPers" ),

    /**
     * The '<em><b>LPers</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #LPERS_VALUE
     * @generated
     * @ordered
     */
    LPERS( 61, "lPers", "lPers" ),

    /**
     * The '<em><b>DBm</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #DBM_VALUE
     * @generated
     * @ordered
     */
    DBM( 62, "dBm", "dBm" ),

    /**
     * The '<em><b>H</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #H_VALUE
     * @generated
     * @ordered
     */
    H( 63, "h", "h" ),

    /**
     * The '<em><b>Min</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #MIN_VALUE
     * @generated
     * @ordered
     */
    MIN( 64, "min", "min" ),

    /**
     * The '<em><b>Q</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #Q_VALUE
     * @generated
     * @ordered
     */
    Q( 65, "Q", "Q" ),

    /**
     * The '<em><b>Qh</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #QH_VALUE
     * @generated
     * @ordered
     */
    QH( 66, "Qh", "Qh" ),

    /**
     * The '<em><b>Ohmm</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #OHMM_VALUE
     * @generated
     * @ordered
     */
    OHMM( 67, "ohmm", "ohmm" ),

    /**
     * The '<em><b>APerm</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #APERM_VALUE
     * @generated
     * @ordered
     */
    APERM( 68, "APerm", "APerm" ),

    /**
     * The '<em><b>V2h</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #V2H_VALUE
     * @generated
     * @ordered
     */
    V2H( 69, "V2h", "V2h" ),

    /**
     * The '<em><b>A2h</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #A2H_VALUE
     * @generated
     * @ordered
     */
    A2H( 70, "A2h", "A2h" ),

    /**
     * The '<em><b>Ah</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #AH_VALUE
     * @generated
     * @ordered
     */
    AH( 71, "Ah", "Ah" ),

    /**
     * The '<em><b>Count</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #COUNT_VALUE
     * @generated
     * @ordered
     */
    COUNT( 72, "count", "count" ),

    /**
     * The '<em><b>Ft3</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #FT3_VALUE
     * @generated
     * @ordered
     */
    FT3( 73, "ft3", "ft3" ),

    /**
     * The '<em><b>M3 Perh</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #M3_PERH_VALUE
     * @generated
     * @ordered
     */
    M3_PERH( 74, "m3Perh", "m3Perh" ),

    /**
     * The '<em><b>Gal</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #GAL_VALUE
     * @generated
     * @ordered
     */
    GAL( 75, "gal", "gal" ),

    /**
     * The '<em><b>Btu</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #BTU_VALUE
     * @generated
     * @ordered
     */
    BTU( 76, "Btu", "Btu" ),

    /**
     * The '<em><b>L</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #L_VALUE
     * @generated
     * @ordered
     */
    L( 77, "l", "l" ),

    /**
     * The '<em><b>LPerh</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #LPERH_VALUE
     * @generated
     * @ordered
     */
    LPERH( 78, "lPerh", "lPerh" ),

    /**
     * The '<em><b>LPerl</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #LPERL_VALUE
     * @generated
     * @ordered
     */
    LPERL( 79, "lPerl", "lPerl" ),

    /**
     * The '<em><b>GPerg</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #GPERG_VALUE
     * @generated
     * @ordered
     */
    GPERG( 80, "gPerg", "gPerg" ),

    /**
     * The '<em><b>Mol Perm3</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #MOL_PERM3_VALUE
     * @generated
     * @ordered
     */
    MOL_PERM3( 81, "molPerm3", "molPerm3" ),

    /**
     * The '<em><b>Mol Permol</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #MOL_PERMOL_VALUE
     * @generated
     * @ordered
     */
    MOL_PERMOL( 82, "molPermol", "molPermol" ),

    /**
     * The '<em><b>Mol Perkg</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #MOL_PERKG_VALUE
     * @generated
     * @ordered
     */
    MOL_PERKG( 83, "molPerkg", "molPerkg" ),

    /**
     * The '<em><b>SPers</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SPERS_VALUE
     * @generated
     * @ordered
     */
    SPERS( 84, "sPers", "sPers" ),

    /**
     * The '<em><b>Hz Per Hz</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #HZ_PER_HZ_VALUE
     * @generated
     * @ordered
     */
    HZ_PER_HZ( 85, "HzPerHz", "HzPerHz" ),

    /**
     * The '<em><b>VPer V</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #VPER_V_VALUE
     * @generated
     * @ordered
     */
    VPER_V( 86, "VPerV", "VPerV" ),

    /**
     * The '<em><b>APer A</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #APER_A_VALUE
     * @generated
     * @ordered
     */
    APER_A( 87, "APerA", "APerA" ),

    /**
     * The '<em><b>VPer VA</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #VPER_VA_VALUE
     * @generated
     * @ordered
     */
    VPER_VA( 88, "VPerVA", "VPerVA" ),

    /**
     * The '<em><b>Rev</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #REV_VALUE
     * @generated
     * @ordered
     */
    REV( 89, "rev", "rev" ),

    /**
     * The '<em><b>Kat</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #KAT_VALUE
     * @generated
     * @ordered
     */
    KAT( 90, "kat", "kat" ),

    /**
     * The '<em><b>JPerkg</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #JPERKG_VALUE
     * @generated
     * @ordered
     */
    JPERKG( 91, "JPerkg", "JPerkg" ),

    /**
     * The '<em><b>M3 Uncompensated</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #M3_UNCOMPENSATED_VALUE
     * @generated
     * @ordered
     */
    M3_UNCOMPENSATED( 92, "m3Uncompensated", "m3Uncompensated" ),

    /**
     * The '<em><b>M3 Compensated</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #M3_COMPENSATED_VALUE
     * @generated
     * @ordered
     */
    M3_COMPENSATED( 93, "m3Compensated", "m3Compensated" ),

    /**
     * The '<em><b>WPer W</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #WPER_W_VALUE
     * @generated
     * @ordered
     */
    WPER_W( 94, "WPerW", "WPerW" ),

    /**
     * The '<em><b>Therm</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #THERM_VALUE
     * @generated
     * @ordered
     */
    THERM( 95, "therm", "therm" ),

    /**
     * The '<em><b>One Perm</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #ONE_PERM_VALUE
     * @generated
     * @ordered
     */
    ONE_PERM( 96, "onePerm", "onePerm" ),

    /**
     * The '<em><b>M3 Perkg</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #M3_PERKG_VALUE
     * @generated
     * @ordered
     */
    M3_PERKG( 97, "m3Perkg", "m3Perkg" ),

    /**
     * The '<em><b>Pas</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #PAS_VALUE
     * @generated
     * @ordered
     */
    PAS( 98, "Pas", "Pas" ),

    /**
     * The '<em><b>Nm</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #NM_VALUE
     * @generated
     * @ordered
     */
    NM( 99, "Nm", "Nm" ),

    /**
     * The '<em><b>NPerm</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #NPERM_VALUE
     * @generated
     * @ordered
     */
    NPERM( 100, "NPerm", "NPerm" ),

    /**
     * The '<em><b>Rad Pers2</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #RAD_PERS2_VALUE
     * @generated
     * @ordered
     */
    RAD_PERS2( 101, "radPers2", "radPers2" ),

    /**
     * The '<em><b>WPerm2</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #WPERM2_VALUE
     * @generated
     * @ordered
     */
    WPERM2( 102, "WPerm2", "WPerm2" ),

    /**
     * The '<em><b>JPerkg K</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #JPERKG_K_VALUE
     * @generated
     * @ordered
     */
    JPERKG_K( 103, "JPerkgK", "JPerkgK" ),

    /**
     * The '<em><b>JPerm3</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #JPERM3_VALUE
     * @generated
     * @ordered
     */
    JPERM3( 104, "JPerm3", "JPerm3" ),

    /**
     * The '<em><b>VPerm</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #VPERM_VALUE
     * @generated
     * @ordered
     */
    VPERM( 105, "VPerm", "VPerm" ),

    /**
     * The '<em><b>CPerm3</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #CPERM3_VALUE
     * @generated
     * @ordered
     */
    CPERM3( 106, "CPerm3", "CPerm3" ),

    /**
     * The '<em><b>CPerm2</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #CPERM2_VALUE
     * @generated
     * @ordered
     */
    CPERM2( 107, "CPerm2", "CPerm2" ),

    /**
     * The '<em><b>FPerm</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #FPERM_VALUE
     * @generated
     * @ordered
     */
    FPERM( 108, "FPerm", "FPerm" ),

    /**
     * The '<em><b>HPerm</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #HPERM_VALUE
     * @generated
     * @ordered
     */
    HPERM( 109, "HPerm", "HPerm" ),

    /**
     * The '<em><b>JPermol</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #JPERMOL_VALUE
     * @generated
     * @ordered
     */
    JPERMOL( 110, "JPermol", "JPermol" ),

    /**
     * The '<em><b>JPermol K</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #JPERMOL_K_VALUE
     * @generated
     * @ordered
     */
    JPERMOL_K( 111, "JPermolK", "JPermolK" ),

    /**
     * The '<em><b>CPerkg</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #CPERKG_VALUE
     * @generated
     * @ordered
     */
    CPERKG( 112, "CPerkg", "CPerkg" ),

    /**
     * The '<em><b>Gy Pers</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #GY_PERS_VALUE
     * @generated
     * @ordered
     */
    GY_PERS( 113, "GyPers", "GyPers" ),

    /**
     * The '<em><b>WPersr</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #WPERSR_VALUE
     * @generated
     * @ordered
     */
    WPERSR( 114, "WPersr", "WPersr" ),

    /**
     * The '<em><b>WPerm2sr</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #WPERM2SR_VALUE
     * @generated
     * @ordered
     */
    WPERM2SR( 115, "WPerm2sr", "WPerm2sr" ),

    /**
     * The '<em><b>Kat Perm3</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #KAT_PERM3_VALUE
     * @generated
     * @ordered
     */
    KAT_PERM3( 116, "katPerm3", "katPerm3" ),

    /**
     * The '<em><b>D</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #D_VALUE
     * @generated
     * @ordered
     */
    D( 117, "d", "d" ),

    /**
     * The '<em><b>Anglemin</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #ANGLEMIN_VALUE
     * @generated
     * @ordered
     */
    ANGLEMIN( 118, "anglemin", "anglemin" ),

    /**
     * The '<em><b>Anglesec</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #ANGLESEC_VALUE
     * @generated
     * @ordered
     */
    ANGLESEC( 119, "anglesec", "anglesec" ),

    /**
     * The '<em><b>Ha</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #HA_VALUE
     * @generated
     * @ordered
     */
    HA( 120, "ha", "ha" ),

    /**
     * The '<em><b>Tonne</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #TONNE_VALUE
     * @generated
     * @ordered
     */
    TONNE( 121, "tonne", "tonne" ),

    /**
     * The '<em><b>Bar</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #BAR_VALUE
     * @generated
     * @ordered
     */
    BAR( 122, "bar", "bar" ),

    /**
     * The '<em><b>Mm Hg</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #MM_HG_VALUE
     * @generated
     * @ordered
     */
    MM_HG( 123, "mmHg", "mmHg" ),

    /**
     * The '<em><b>M</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #M_VALUE
     * @generated
     * @ordered
     */
    M( 124, "M", "M" ),

    /**
     * The '<em><b>Kn</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #KN_VALUE
     * @generated
     * @ordered
     */
    KN( 125, "kn", "kn" ),

    /**
     * The '<em><b>Vh</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #VH_VALUE
     * @generated
     * @ordered
     */
    VH( 126, "Vh", "Vh" ),

    /**
     * The '<em><b>Mx</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #MX_VALUE
     * @generated
     * @ordered
     */
    MX( 127, "Mx", "Mx" ),

    /**
     * The '<em><b>G</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #G_VALUE
     * @generated
     * @ordered
     */
    G( 128, "G", "G" ),

    /**
     * The '<em><b>Oe</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #OE_VALUE
     * @generated
     * @ordered
     */
    OE( 129, "Oe", "Oe" ),

    /**
     * The '<em><b>WPer A</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #WPER_A_VALUE
     * @generated
     * @ordered
     */
    WPER_A( 130, "WPerA", "WPerA" ),

    /**
     * The '<em><b>SPerm</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SPERM_VALUE
     * @generated
     * @ordered
     */
    SPERM( 131, "SPerm", "SPerm" ),

    /**
     * The '<em><b>One Per Hz</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #ONE_PER_HZ_VALUE
     * @generated
     * @ordered
     */
    ONE_PER_HZ( 132, "onePerHz", "onePerHz" ),

    /**
     * The '<em><b>VPer VAr</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #VPER_VAR_VALUE
     * @generated
     * @ordered
     */
    VPER_VAR( 133, "VPerVAr", "VPerVAr" ),

    /**
     * The '<em><b>Ohm Perm</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #OHM_PERM_VALUE
     * @generated
     * @ordered
     */
    OHM_PERM( 134, "ohmPerm", "ohmPerm" ),

    /**
     * The '<em><b>Kg Per J</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #KG_PER_J_VALUE
     * @generated
     * @ordered
     */
    KG_PER_J( 135, "kgPerJ", "kgPerJ" ),

    /**
     * The '<em><b>JPers</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #JPERS_VALUE
     * @generated
     * @ordered
     */
    JPERS( 136, "JPers", "JPers" ),

    /**
     * The '<em><b>M2 Pers</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #M2_PERS_VALUE
     * @generated
     * @ordered
     */
    M2_PERS( 137, "m2Pers", "m2Pers" ),

    /**
     * The '<em><b>JPerm2</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #JPERM2_VALUE
     * @generated
     * @ordered
     */
    JPERM2( 138, "JPerm2", "JPerm2" ),

    /**
     * The '<em><b>KPers</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #KPERS_VALUE
     * @generated
     * @ordered
     */
    KPERS( 139, "KPers", "KPers" ),

    /**
     * The '<em><b>Pa Pers</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #PA_PERS_VALUE
     * @generated
     * @ordered
     */
    PA_PERS( 140, "PaPers", "PaPers" );

    /**
     * The '<em><b>None</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>None</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #NONE
     * @model name="none"
     * @generated
     * @ordered
     */
    public static final int NONE_VALUE = 0;

    /**
     * The '<em><b>Milli</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Milli</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #MILLI
     * @model name="milli"
     * @generated
     * @ordered
     */
    public static final int MILLI_VALUE = 1;

    /**
     * The '<em><b>Kg</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Kg</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #KG
     * @model name="kg"
     * @generated
     * @ordered
     */
    public static final int KG_VALUE = 2;

    /**
     * The '<em><b>S</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>S</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #S
     * @model name="s"
     * @generated
     * @ordered
     */
    public static final int S_VALUE = 3;

    /**
     * The '<em><b>A</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>A</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #A
     * @model
     * @generated
     * @ordered
     */
    public static final int A_VALUE = 4;

    /**
     * The '<em><b>K</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>K</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #K
     * @model
     * @generated
     * @ordered
     */
    public static final int K_VALUE = 5;

    /**
     * The '<em><b>Mol</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Mol</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #MOL
     * @model name="mol"
     * @generated
     * @ordered
     */
    public static final int MOL_VALUE = 6;

    /**
     * The '<em><b>Cd</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Cd</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #CD
     * @model name="cd"
     * @generated
     * @ordered
     */
    public static final int CD_VALUE = 7;

    /**
     * The '<em><b>Deg</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Deg</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #DEG
     * @model name="deg"
     * @generated
     * @ordered
     */
    public static final int DEG_VALUE = 8;

    /**
     * The '<em><b>Rad</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Rad</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #RAD
     * @model name="rad"
     * @generated
     * @ordered
     */
    public static final int RAD_VALUE = 9;

    /**
     * The '<em><b>Sr</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Sr</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #SR
     * @model name="sr"
     * @generated
     * @ordered
     */
    public static final int SR_VALUE = 10;

    /**
     * The '<em><b>Gy</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Gy</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #GY
     * @model name="Gy"
     * @generated
     * @ordered
     */
    public static final int GY_VALUE = 11;

    /**
     * The '<em><b>Bq</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Bq</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #BQ
     * @model name="Bq"
     * @generated
     * @ordered
     */
    public static final int BQ_VALUE = 12;

    /**
     * The '<em><b>Deg C</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Deg C</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #DEG_C
     * @model name="degC"
     * @generated
     * @ordered
     */
    public static final int DEG_C_VALUE = 13;

    /**
     * The '<em><b>Sv</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Sv</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #SV
     * @model name="Sv"
     * @generated
     * @ordered
     */
    public static final int SV_VALUE = 14;

    /**
     * The '<em><b>F</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>F</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #F
     * @model
     * @generated
     * @ordered
     */
    public static final int F_VALUE = 15;

    /**
     * The '<em><b>C</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>C</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #C
     * @model
     * @generated
     * @ordered
     */
    public static final int C_VALUE = 16;

    /**
     * The '<em><b>Siemens</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Siemens</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #SIEMENS
     * @model name="Siemens"
     * @generated
     * @ordered
     */
    public static final int SIEMENS_VALUE = 17;

    /**
     * The '<em><b>Henri</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Henri</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #HENRI
     * @model name="Henri"
     * @generated
     * @ordered
     */
    public static final int HENRI_VALUE = 18;

    /**
     * The '<em><b>V</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>V</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #V
     * @model
     * @generated
     * @ordered
     */
    public static final int V_VALUE = 19;

    /**
     * The '<em><b>Ohm</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Ohm</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #OHM
     * @model name="ohm"
     * @generated
     * @ordered
     */
    public static final int OHM_VALUE = 20;

    /**
     * The '<em><b>J</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>J</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #J
     * @model
     * @generated
     * @ordered
     */
    public static final int J_VALUE = 21;

    /**
     * The '<em><b>N</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>N</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #N
     * @model
     * @generated
     * @ordered
     */
    public static final int N_VALUE = 22;

    /**
     * The '<em><b>Hz</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Hz</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #HZ
     * @model name="Hz"
     * @generated
     * @ordered
     */
    public static final int HZ_VALUE = 23;

    /**
     * The '<em><b>Lx</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Lx</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #LX
     * @model name="lx"
     * @generated
     * @ordered
     */
    public static final int LX_VALUE = 24;

    /**
     * The '<em><b>Lm</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Lm</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #LM
     * @model name="lm"
     * @generated
     * @ordered
     */
    public static final int LM_VALUE = 25;

    /**
     * The '<em><b>Wb</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Wb</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #WB
     * @model name="Wb"
     * @generated
     * @ordered
     */
    public static final int WB_VALUE = 26;

    /**
     * The '<em><b>T</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>T</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #T
     * @model
     * @generated
     * @ordered
     */
    public static final int T_VALUE = 27;

    /**
     * The '<em><b>W</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>W</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #W
     * @model
     * @generated
     * @ordered
     */
    public static final int W_VALUE = 28;

    /**
     * The '<em><b>Pa</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Pa</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #PA
     * @model name="Pa"
     * @generated
     * @ordered
     */
    public static final int PA_VALUE = 29;

    /**
     * The '<em><b>M2</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>M2</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #M2
     * @model name="m2"
     * @generated
     * @ordered
     */
    public static final int M2_VALUE = 30;

    /**
     * The '<em><b>M3</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>M3</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #M3
     * @model name="m3"
     * @generated
     * @ordered
     */
    public static final int M3_VALUE = 31;

    /**
     * The '<em><b>MPers</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>MPers</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #MPERS
     * @model name="mPers"
     * @generated
     * @ordered
     */
    public static final int MPERS_VALUE = 32;

    /**
     * The '<em><b>MPers2</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>MPers2</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #MPERS2
     * @model name="mPers2"
     * @generated
     * @ordered
     */
    public static final int MPERS2_VALUE = 33;

    /**
     * The '<em><b>M3 Pers</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>M3 Pers</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #M3_PERS
     * @model name="m3Pers"
     * @generated
     * @ordered
     */
    public static final int M3_PERS_VALUE = 34;

    /**
     * The '<em><b>MPerm3</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>MPerm3</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #MPERM3
     * @model name="mPerm3"
     * @generated
     * @ordered
     */
    public static final int MPERM3_VALUE = 35;

    /**
     * The '<em><b>Kgm</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Kgm</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #KGM
     * @model name="kgm"
     * @generated
     * @ordered
     */
    public static final int KGM_VALUE = 36;

    /**
     * The '<em><b>Kg Perm3</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Kg Perm3</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #KG_PERM3
     * @model name="kgPerm3"
     * @generated
     * @ordered
     */
    public static final int KG_PERM3_VALUE = 37;

    /**
     * The '<em><b>WPerm K</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>WPerm K</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #WPERM_K
     * @model name="WPermK"
     * @generated
     * @ordered
     */
    public static final int WPERM_K_VALUE = 38;

    /**
     * The '<em><b>JPer K</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>JPer K</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #JPER_K
     * @model name="JPerK"
     * @generated
     * @ordered
     */
    public static final int JPER_K_VALUE = 39;

    /**
     * The '<em><b>Ppm</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Ppm</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #PPM
     * @model name="ppm"
     * @generated
     * @ordered
     */
    public static final int PPM_VALUE = 40;

    /**
     * The '<em><b>Rot Pers</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Rot Pers</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #ROT_PERS
     * @model name="rotPers"
     * @generated
     * @ordered
     */
    public static final int ROT_PERS_VALUE = 41;

    /**
     * The '<em><b>Rad Pers</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Rad Pers</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #RAD_PERS
     * @model name="radPers"
     * @generated
     * @ordered
     */
    public static final int RAD_PERS_VALUE = 42;

    /**
     * The '<em><b>VA</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>VA</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #VA
     * @model
     * @generated
     * @ordered
     */
    public static final int VA_VALUE = 43;

    /**
     * The '<em><b>VAr</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>VAr</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #VAR
     * @model name="VAr"
     * @generated
     * @ordered
     */
    public static final int VAR_VALUE = 44;

    /**
     * The '<em><b>Cos Phi</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Cos Phi</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #COS_PHI
     * @model name="cosPhi"
     * @generated
     * @ordered
     */
    public static final int COS_PHI_VALUE = 45;

    /**
     * The '<em><b>Vs</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Vs</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #VS
     * @model name="Vs"
     * @generated
     * @ordered
     */
    public static final int VS_VALUE = 46;

    /**
     * The '<em><b>V2</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>V2</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #V2
     * @model
     * @generated
     * @ordered
     */
    public static final int V2_VALUE = 47;

    /**
     * The '<em><b>As</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>As</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #AS
     * @model name="As"
     * @generated
     * @ordered
     */
    public static final int AS_VALUE = 48;

    /**
     * The '<em><b>A2</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>A2</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #A2
     * @model
     * @generated
     * @ordered
     */
    public static final int A2_VALUE = 49;

    /**
     * The '<em><b>A2s</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>A2s</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #A2S
     * @model name="A2s"
     * @generated
     * @ordered
     */
    public static final int A2S_VALUE = 50;

    /**
     * The '<em><b>VAh</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>VAh</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #VAH
     * @model name="VAh"
     * @generated
     * @ordered
     */
    public static final int VAH_VALUE = 51;

    /**
     * The '<em><b>Wh</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Wh</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #WH
     * @model name="Wh"
     * @generated
     * @ordered
     */
    public static final int WH_VALUE = 52;

    /**
     * The '<em><b>VArh</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>VArh</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #VARH
     * @model name="VArh"
     * @generated
     * @ordered
     */
    public static final int VARH_VALUE = 53;

    /**
     * The '<em><b>VPer Hz</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>VPer Hz</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #VPER_HZ
     * @model name="VPerHz"
     * @generated
     * @ordered
     */
    public static final int VPER_HZ_VALUE = 54;

    /**
     * The '<em><b>Hz Pers</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Hz Pers</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #HZ_PERS
     * @model name="HzPers"
     * @generated
     * @ordered
     */
    public static final int HZ_PERS_VALUE = 55;

    /**
     * The '<em><b>Character</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Character</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #CHARACTER
     * @model name="character"
     * @generated
     * @ordered
     */
    public static final int CHARACTER_VALUE = 56;

    /**
     * The '<em><b>Char Pers</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Char Pers</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #CHAR_PERS
     * @model name="charPers"
     * @generated
     * @ordered
     */
    public static final int CHAR_PERS_VALUE = 57;

    /**
     * The '<em><b>Kgm2</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Kgm2</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #KGM2
     * @model name="kgm2"
     * @generated
     * @ordered
     */
    public static final int KGM2_VALUE = 58;

    /**
     * The '<em><b>DB</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>DB</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #DB
     * @model name="dB"
     * @generated
     * @ordered
     */
    public static final int DB_VALUE = 59;

    /**
     * The '<em><b>WPers</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>WPers</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #WPERS
     * @model name="WPers"
     * @generated
     * @ordered
     */
    public static final int WPERS_VALUE = 60;

    /**
     * The '<em><b>LPers</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>LPers</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #LPERS
     * @model name="lPers"
     * @generated
     * @ordered
     */
    public static final int LPERS_VALUE = 61;

    /**
     * The '<em><b>DBm</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>DBm</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #DBM
     * @model name="dBm"
     * @generated
     * @ordered
     */
    public static final int DBM_VALUE = 62;

    /**
     * The '<em><b>H</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>H</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #H
     * @model name="h"
     * @generated
     * @ordered
     */
    public static final int H_VALUE = 63;

    /**
     * The '<em><b>Min</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Min</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #MIN
     * @model name="min"
     * @generated
     * @ordered
     */
    public static final int MIN_VALUE = 64;

    /**
     * The '<em><b>Q</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Q</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #Q
     * @model
     * @generated
     * @ordered
     */
    public static final int Q_VALUE = 65;

    /**
     * The '<em><b>Qh</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Qh</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #QH
     * @model name="Qh"
     * @generated
     * @ordered
     */
    public static final int QH_VALUE = 66;

    /**
     * The '<em><b>Ohmm</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Ohmm</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #OHMM
     * @model name="ohmm"
     * @generated
     * @ordered
     */
    public static final int OHMM_VALUE = 67;

    /**
     * The '<em><b>APerm</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>APerm</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #APERM
     * @model name="APerm"
     * @generated
     * @ordered
     */
    public static final int APERM_VALUE = 68;

    /**
     * The '<em><b>V2h</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>V2h</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #V2H
     * @model name="V2h"
     * @generated
     * @ordered
     */
    public static final int V2H_VALUE = 69;

    /**
     * The '<em><b>A2h</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>A2h</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #A2H
     * @model name="A2h"
     * @generated
     * @ordered
     */
    public static final int A2H_VALUE = 70;

    /**
     * The '<em><b>Ah</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Ah</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #AH
     * @model name="Ah"
     * @generated
     * @ordered
     */
    public static final int AH_VALUE = 71;

    /**
     * The '<em><b>Count</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Count</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #COUNT
     * @model name="count"
     * @generated
     * @ordered
     */
    public static final int COUNT_VALUE = 72;

    /**
     * The '<em><b>Ft3</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Ft3</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #FT3
     * @model name="ft3"
     * @generated
     * @ordered
     */
    public static final int FT3_VALUE = 73;

    /**
     * The '<em><b>M3 Perh</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>M3 Perh</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #M3_PERH
     * @model name="m3Perh"
     * @generated
     * @ordered
     */
    public static final int M3_PERH_VALUE = 74;

    /**
     * The '<em><b>Gal</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Gal</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #GAL
     * @model name="gal"
     * @generated
     * @ordered
     */
    public static final int GAL_VALUE = 75;

    /**
     * The '<em><b>Btu</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Btu</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #BTU
     * @model name="Btu"
     * @generated
     * @ordered
     */
    public static final int BTU_VALUE = 76;

    /**
     * The '<em><b>L</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>L</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #L
     * @model name="l"
     * @generated
     * @ordered
     */
    public static final int L_VALUE = 77;

    /**
     * The '<em><b>LPerh</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>LPerh</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #LPERH
     * @model name="lPerh"
     * @generated
     * @ordered
     */
    public static final int LPERH_VALUE = 78;

    /**
     * The '<em><b>LPerl</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>LPerl</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #LPERL
     * @model name="lPerl"
     * @generated
     * @ordered
     */
    public static final int LPERL_VALUE = 79;

    /**
     * The '<em><b>GPerg</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>GPerg</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #GPERG
     * @model name="gPerg"
     * @generated
     * @ordered
     */
    public static final int GPERG_VALUE = 80;

    /**
     * The '<em><b>Mol Perm3</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Mol Perm3</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #MOL_PERM3
     * @model name="molPerm3"
     * @generated
     * @ordered
     */
    public static final int MOL_PERM3_VALUE = 81;

    /**
     * The '<em><b>Mol Permol</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Mol Permol</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #MOL_PERMOL
     * @model name="molPermol"
     * @generated
     * @ordered
     */
    public static final int MOL_PERMOL_VALUE = 82;

    /**
     * The '<em><b>Mol Perkg</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Mol Perkg</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #MOL_PERKG
     * @model name="molPerkg"
     * @generated
     * @ordered
     */
    public static final int MOL_PERKG_VALUE = 83;

    /**
     * The '<em><b>SPers</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>SPers</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #SPERS
     * @model name="sPers"
     * @generated
     * @ordered
     */
    public static final int SPERS_VALUE = 84;

    /**
     * The '<em><b>Hz Per Hz</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Hz Per Hz</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #HZ_PER_HZ
     * @model name="HzPerHz"
     * @generated
     * @ordered
     */
    public static final int HZ_PER_HZ_VALUE = 85;

    /**
     * The '<em><b>VPer V</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>VPer V</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #VPER_V
     * @model name="VPerV"
     * @generated
     * @ordered
     */
    public static final int VPER_V_VALUE = 86;

    /**
     * The '<em><b>APer A</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>APer A</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #APER_A
     * @model name="APerA"
     * @generated
     * @ordered
     */
    public static final int APER_A_VALUE = 87;

    /**
     * The '<em><b>VPer VA</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>VPer VA</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #VPER_VA
     * @model name="VPerVA"
     * @generated
     * @ordered
     */
    public static final int VPER_VA_VALUE = 88;

    /**
     * The '<em><b>Rev</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Rev</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #REV
     * @model name="rev"
     * @generated
     * @ordered
     */
    public static final int REV_VALUE = 89;

    /**
     * The '<em><b>Kat</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Kat</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #KAT
     * @model name="kat"
     * @generated
     * @ordered
     */
    public static final int KAT_VALUE = 90;

    /**
     * The '<em><b>JPerkg</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>JPerkg</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #JPERKG
     * @model name="JPerkg"
     * @generated
     * @ordered
     */
    public static final int JPERKG_VALUE = 91;

    /**
     * The '<em><b>M3 Uncompensated</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>M3 Uncompensated</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #M3_UNCOMPENSATED
     * @model name="m3Uncompensated"
     * @generated
     * @ordered
     */
    public static final int M3_UNCOMPENSATED_VALUE = 92;

    /**
     * The '<em><b>M3 Compensated</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>M3 Compensated</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #M3_COMPENSATED
     * @model name="m3Compensated"
     * @generated
     * @ordered
     */
    public static final int M3_COMPENSATED_VALUE = 93;

    /**
     * The '<em><b>WPer W</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>WPer W</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #WPER_W
     * @model name="WPerW"
     * @generated
     * @ordered
     */
    public static final int WPER_W_VALUE = 94;

    /**
     * The '<em><b>Therm</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Therm</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #THERM
     * @model name="therm"
     * @generated
     * @ordered
     */
    public static final int THERM_VALUE = 95;

    /**
     * The '<em><b>One Perm</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>One Perm</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #ONE_PERM
     * @model name="onePerm"
     * @generated
     * @ordered
     */
    public static final int ONE_PERM_VALUE = 96;

    /**
     * The '<em><b>M3 Perkg</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>M3 Perkg</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #M3_PERKG
     * @model name="m3Perkg"
     * @generated
     * @ordered
     */
    public static final int M3_PERKG_VALUE = 97;

    /**
     * The '<em><b>Pas</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Pas</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #PAS
     * @model name="Pas"
     * @generated
     * @ordered
     */
    public static final int PAS_VALUE = 98;

    /**
     * The '<em><b>Nm</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Nm</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #NM
     * @model name="Nm"
     * @generated
     * @ordered
     */
    public static final int NM_VALUE = 99;

    /**
     * The '<em><b>NPerm</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>NPerm</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #NPERM
     * @model name="NPerm"
     * @generated
     * @ordered
     */
    public static final int NPERM_VALUE = 100;

    /**
     * The '<em><b>Rad Pers2</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Rad Pers2</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #RAD_PERS2
     * @model name="radPers2"
     * @generated
     * @ordered
     */
    public static final int RAD_PERS2_VALUE = 101;

    /**
     * The '<em><b>WPerm2</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>WPerm2</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #WPERM2
     * @model name="WPerm2"
     * @generated
     * @ordered
     */
    public static final int WPERM2_VALUE = 102;

    /**
     * The '<em><b>JPerkg K</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>JPerkg K</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #JPERKG_K
     * @model name="JPerkgK"
     * @generated
     * @ordered
     */
    public static final int JPERKG_K_VALUE = 103;

    /**
     * The '<em><b>JPerm3</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>JPerm3</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #JPERM3
     * @model name="JPerm3"
     * @generated
     * @ordered
     */
    public static final int JPERM3_VALUE = 104;

    /**
     * The '<em><b>VPerm</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>VPerm</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #VPERM
     * @model name="VPerm"
     * @generated
     * @ordered
     */
    public static final int VPERM_VALUE = 105;

    /**
     * The '<em><b>CPerm3</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>CPerm3</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #CPERM3
     * @model name="CPerm3"
     * @generated
     * @ordered
     */
    public static final int CPERM3_VALUE = 106;

    /**
     * The '<em><b>CPerm2</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>CPerm2</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #CPERM2
     * @model name="CPerm2"
     * @generated
     * @ordered
     */
    public static final int CPERM2_VALUE = 107;

    /**
     * The '<em><b>FPerm</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>FPerm</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #FPERM
     * @model name="FPerm"
     * @generated
     * @ordered
     */
    public static final int FPERM_VALUE = 108;

    /**
     * The '<em><b>HPerm</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>HPerm</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #HPERM
     * @model name="HPerm"
     * @generated
     * @ordered
     */
    public static final int HPERM_VALUE = 109;

    /**
     * The '<em><b>JPermol</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>JPermol</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #JPERMOL
     * @model name="JPermol"
     * @generated
     * @ordered
     */
    public static final int JPERMOL_VALUE = 110;

    /**
     * The '<em><b>JPermol K</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>JPermol K</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #JPERMOL_K
     * @model name="JPermolK"
     * @generated
     * @ordered
     */
    public static final int JPERMOL_K_VALUE = 111;

    /**
     * The '<em><b>CPerkg</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>CPerkg</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #CPERKG
     * @model name="CPerkg"
     * @generated
     * @ordered
     */
    public static final int CPERKG_VALUE = 112;

    /**
     * The '<em><b>Gy Pers</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Gy Pers</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #GY_PERS
     * @model name="GyPers"
     * @generated
     * @ordered
     */
    public static final int GY_PERS_VALUE = 113;

    /**
     * The '<em><b>WPersr</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>WPersr</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #WPERSR
     * @model name="WPersr"
     * @generated
     * @ordered
     */
    public static final int WPERSR_VALUE = 114;

    /**
     * The '<em><b>WPerm2sr</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>WPerm2sr</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #WPERM2SR
     * @model name="WPerm2sr"
     * @generated
     * @ordered
     */
    public static final int WPERM2SR_VALUE = 115;

    /**
     * The '<em><b>Kat Perm3</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Kat Perm3</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #KAT_PERM3
     * @model name="katPerm3"
     * @generated
     * @ordered
     */
    public static final int KAT_PERM3_VALUE = 116;

    /**
     * The '<em><b>D</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>D</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #D
     * @model name="d"
     * @generated
     * @ordered
     */
    public static final int D_VALUE = 117;

    /**
     * The '<em><b>Anglemin</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Anglemin</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #ANGLEMIN
     * @model name="anglemin"
     * @generated
     * @ordered
     */
    public static final int ANGLEMIN_VALUE = 118;

    /**
     * The '<em><b>Anglesec</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Anglesec</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #ANGLESEC
     * @model name="anglesec"
     * @generated
     * @ordered
     */
    public static final int ANGLESEC_VALUE = 119;

    /**
     * The '<em><b>Ha</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Ha</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #HA
     * @model name="ha"
     * @generated
     * @ordered
     */
    public static final int HA_VALUE = 120;

    /**
     * The '<em><b>Tonne</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Tonne</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #TONNE
     * @model name="tonne"
     * @generated
     * @ordered
     */
    public static final int TONNE_VALUE = 121;

    /**
     * The '<em><b>Bar</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Bar</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #BAR
     * @model name="bar"
     * @generated
     * @ordered
     */
    public static final int BAR_VALUE = 122;

    /**
     * The '<em><b>Mm Hg</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Mm Hg</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #MM_HG
     * @model name="mmHg"
     * @generated
     * @ordered
     */
    public static final int MM_HG_VALUE = 123;

    /**
     * The '<em><b>M</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>M</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #M
     * @model
     * @generated
     * @ordered
     */
    public static final int M_VALUE = 124;

    /**
     * The '<em><b>Kn</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Kn</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #KN
     * @model name="kn"
     * @generated
     * @ordered
     */
    public static final int KN_VALUE = 125;

    /**
     * The '<em><b>Vh</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Vh</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #VH
     * @model name="Vh"
     * @generated
     * @ordered
     */
    public static final int VH_VALUE = 126;

    /**
     * The '<em><b>Mx</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Mx</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #MX
     * @model name="Mx"
     * @generated
     * @ordered
     */
    public static final int MX_VALUE = 127;

    /**
     * The '<em><b>G</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>G</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #G
     * @model
     * @generated
     * @ordered
     */
    public static final int G_VALUE = 128;

    /**
     * The '<em><b>Oe</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Oe</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #OE
     * @model name="Oe"
     * @generated
     * @ordered
     */
    public static final int OE_VALUE = 129;

    /**
     * The '<em><b>WPer A</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>WPer A</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #WPER_A
     * @model name="WPerA"
     * @generated
     * @ordered
     */
    public static final int WPER_A_VALUE = 130;

    /**
     * The '<em><b>SPerm</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>SPerm</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #SPERM
     * @model name="SPerm"
     * @generated
     * @ordered
     */
    public static final int SPERM_VALUE = 131;

    /**
     * The '<em><b>One Per Hz</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>One Per Hz</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #ONE_PER_HZ
     * @model name="onePerHz"
     * @generated
     * @ordered
     */
    public static final int ONE_PER_HZ_VALUE = 132;

    /**
     * The '<em><b>VPer VAr</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>VPer VAr</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #VPER_VAR
     * @model name="VPerVAr"
     * @generated
     * @ordered
     */
    public static final int VPER_VAR_VALUE = 133;

    /**
     * The '<em><b>Ohm Perm</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Ohm Perm</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #OHM_PERM
     * @model name="ohmPerm"
     * @generated
     * @ordered
     */
    public static final int OHM_PERM_VALUE = 134;

    /**
     * The '<em><b>Kg Per J</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Kg Per J</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #KG_PER_J
     * @model name="kgPerJ"
     * @generated
     * @ordered
     */
    public static final int KG_PER_J_VALUE = 135;

    /**
     * The '<em><b>JPers</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>JPers</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #JPERS
     * @model name="JPers"
     * @generated
     * @ordered
     */
    public static final int JPERS_VALUE = 136;

    /**
     * The '<em><b>M2 Pers</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>M2 Pers</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #M2_PERS
     * @model name="m2Pers"
     * @generated
     * @ordered
     */
    public static final int M2_PERS_VALUE = 137;

    /**
     * The '<em><b>JPerm2</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>JPerm2</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #JPERM2
     * @model name="JPerm2"
     * @generated
     * @ordered
     */
    public static final int JPERM2_VALUE = 138;

    /**
     * The '<em><b>KPers</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>KPers</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #KPERS
     * @model name="KPers"
     * @generated
     * @ordered
     */
    public static final int KPERS_VALUE = 139;

    /**
     * The '<em><b>Pa Pers</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Pa Pers</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #PA_PERS
     * @model name="PaPers"
     * @generated
     * @ordered
     */
    public static final int PA_PERS_VALUE = 140;

    /**
     * An array of all the '<em><b>Unit Symbol</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final UnitSymbol[] VALUES_ARRAY = new UnitSymbol[] { NONE, MILLI, KG, S, A, K, MOL, CD, DEG, RAD, SR,
            GY, BQ, DEG_C, SV, F, C, SIEMENS, HENRI, V, OHM, J, N, HZ, LX, LM, WB, T, W, PA, M2, M3, MPERS, MPERS2,
            M3_PERS, MPERM3, KGM, KG_PERM3, WPERM_K, JPER_K, PPM, ROT_PERS, RAD_PERS, VA, VAR, COS_PHI, VS, V2, AS, A2,
            A2S, VAH, WH, VARH, VPER_HZ, HZ_PERS, CHARACTER, CHAR_PERS, KGM2, DB, WPERS, LPERS, DBM, H, MIN, Q, QH,
            OHMM, APERM, V2H, A2H, AH, COUNT, FT3, M3_PERH, GAL, BTU, L, LPERH, LPERL, GPERG, MOL_PERM3, MOL_PERMOL,
            MOL_PERKG, SPERS, HZ_PER_HZ, VPER_V, APER_A, VPER_VA, REV, KAT, JPERKG, M3_UNCOMPENSATED, M3_COMPENSATED,
            WPER_W, THERM, ONE_PERM, M3_PERKG, PAS, NM, NPERM, RAD_PERS2, WPERM2, JPERKG_K, JPERM3, VPERM, CPERM3,
            CPERM2, FPERM, HPERM, JPERMOL, JPERMOL_K, CPERKG, GY_PERS, WPERSR, WPERM2SR, KAT_PERM3, D, ANGLEMIN,
            ANGLESEC, HA, TONNE, BAR, MM_HG, M, KN, VH, MX, G, OE, WPER_A, SPERM, ONE_PER_HZ, VPER_VAR, OHM_PERM,
            KG_PER_J, JPERS, M2_PERS, JPERM2, KPERS, PA_PERS, };

    /**
     * A public read-only list of all the '<em><b>Unit Symbol</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List< UnitSymbol > VALUES = Collections.unmodifiableList( Arrays.asList( VALUES_ARRAY ) );

    /**
     * Returns the '<em><b>Unit Symbol</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static UnitSymbol get( String literal ) {
        for( int i = 0; i < VALUES_ARRAY.length; ++i ) {
            UnitSymbol result = VALUES_ARRAY[i];
            if( result.toString().equals( literal ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Unit Symbol</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static UnitSymbol getByName( String name ) {
        for( int i = 0; i < VALUES_ARRAY.length; ++i ) {
            UnitSymbol result = VALUES_ARRAY[i];
            if( result.getName().equals( name ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Unit Symbol</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static UnitSymbol get( int value ) {
        switch( value ) {
        case NONE_VALUE:
            return NONE;
        case MILLI_VALUE:
            return MILLI;
        case KG_VALUE:
            return KG;
        case S_VALUE:
            return S;
        case A_VALUE:
            return A;
        case K_VALUE:
            return K;
        case MOL_VALUE:
            return MOL;
        case CD_VALUE:
            return CD;
        case DEG_VALUE:
            return DEG;
        case RAD_VALUE:
            return RAD;
        case SR_VALUE:
            return SR;
        case GY_VALUE:
            return GY;
        case BQ_VALUE:
            return BQ;
        case DEG_C_VALUE:
            return DEG_C;
        case SV_VALUE:
            return SV;
        case F_VALUE:
            return F;
        case C_VALUE:
            return C;
        case SIEMENS_VALUE:
            return SIEMENS;
        case HENRI_VALUE:
            return HENRI;
        case V_VALUE:
            return V;
        case OHM_VALUE:
            return OHM;
        case J_VALUE:
            return J;
        case N_VALUE:
            return N;
        case HZ_VALUE:
            return HZ;
        case LX_VALUE:
            return LX;
        case LM_VALUE:
            return LM;
        case WB_VALUE:
            return WB;
        case T_VALUE:
            return T;
        case W_VALUE:
            return W;
        case PA_VALUE:
            return PA;
        case M2_VALUE:
            return M2;
        case M3_VALUE:
            return M3;
        case MPERS_VALUE:
            return MPERS;
        case MPERS2_VALUE:
            return MPERS2;
        case M3_PERS_VALUE:
            return M3_PERS;
        case MPERM3_VALUE:
            return MPERM3;
        case KGM_VALUE:
            return KGM;
        case KG_PERM3_VALUE:
            return KG_PERM3;
        case WPERM_K_VALUE:
            return WPERM_K;
        case JPER_K_VALUE:
            return JPER_K;
        case PPM_VALUE:
            return PPM;
        case ROT_PERS_VALUE:
            return ROT_PERS;
        case RAD_PERS_VALUE:
            return RAD_PERS;
        case VA_VALUE:
            return VA;
        case VAR_VALUE:
            return VAR;
        case COS_PHI_VALUE:
            return COS_PHI;
        case VS_VALUE:
            return VS;
        case V2_VALUE:
            return V2;
        case AS_VALUE:
            return AS;
        case A2_VALUE:
            return A2;
        case A2S_VALUE:
            return A2S;
        case VAH_VALUE:
            return VAH;
        case WH_VALUE:
            return WH;
        case VARH_VALUE:
            return VARH;
        case VPER_HZ_VALUE:
            return VPER_HZ;
        case HZ_PERS_VALUE:
            return HZ_PERS;
        case CHARACTER_VALUE:
            return CHARACTER;
        case CHAR_PERS_VALUE:
            return CHAR_PERS;
        case KGM2_VALUE:
            return KGM2;
        case DB_VALUE:
            return DB;
        case WPERS_VALUE:
            return WPERS;
        case LPERS_VALUE:
            return LPERS;
        case DBM_VALUE:
            return DBM;
        case H_VALUE:
            return H;
        case MIN_VALUE:
            return MIN;
        case Q_VALUE:
            return Q;
        case QH_VALUE:
            return QH;
        case OHMM_VALUE:
            return OHMM;
        case APERM_VALUE:
            return APERM;
        case V2H_VALUE:
            return V2H;
        case A2H_VALUE:
            return A2H;
        case AH_VALUE:
            return AH;
        case COUNT_VALUE:
            return COUNT;
        case FT3_VALUE:
            return FT3;
        case M3_PERH_VALUE:
            return M3_PERH;
        case GAL_VALUE:
            return GAL;
        case BTU_VALUE:
            return BTU;
        case L_VALUE:
            return L;
        case LPERH_VALUE:
            return LPERH;
        case LPERL_VALUE:
            return LPERL;
        case GPERG_VALUE:
            return GPERG;
        case MOL_PERM3_VALUE:
            return MOL_PERM3;
        case MOL_PERMOL_VALUE:
            return MOL_PERMOL;
        case MOL_PERKG_VALUE:
            return MOL_PERKG;
        case SPERS_VALUE:
            return SPERS;
        case HZ_PER_HZ_VALUE:
            return HZ_PER_HZ;
        case VPER_V_VALUE:
            return VPER_V;
        case APER_A_VALUE:
            return APER_A;
        case VPER_VA_VALUE:
            return VPER_VA;
        case REV_VALUE:
            return REV;
        case KAT_VALUE:
            return KAT;
        case JPERKG_VALUE:
            return JPERKG;
        case M3_UNCOMPENSATED_VALUE:
            return M3_UNCOMPENSATED;
        case M3_COMPENSATED_VALUE:
            return M3_COMPENSATED;
        case WPER_W_VALUE:
            return WPER_W;
        case THERM_VALUE:
            return THERM;
        case ONE_PERM_VALUE:
            return ONE_PERM;
        case M3_PERKG_VALUE:
            return M3_PERKG;
        case PAS_VALUE:
            return PAS;
        case NM_VALUE:
            return NM;
        case NPERM_VALUE:
            return NPERM;
        case RAD_PERS2_VALUE:
            return RAD_PERS2;
        case WPERM2_VALUE:
            return WPERM2;
        case JPERKG_K_VALUE:
            return JPERKG_K;
        case JPERM3_VALUE:
            return JPERM3;
        case VPERM_VALUE:
            return VPERM;
        case CPERM3_VALUE:
            return CPERM3;
        case CPERM2_VALUE:
            return CPERM2;
        case FPERM_VALUE:
            return FPERM;
        case HPERM_VALUE:
            return HPERM;
        case JPERMOL_VALUE:
            return JPERMOL;
        case JPERMOL_K_VALUE:
            return JPERMOL_K;
        case CPERKG_VALUE:
            return CPERKG;
        case GY_PERS_VALUE:
            return GY_PERS;
        case WPERSR_VALUE:
            return WPERSR;
        case WPERM2SR_VALUE:
            return WPERM2SR;
        case KAT_PERM3_VALUE:
            return KAT_PERM3;
        case D_VALUE:
            return D;
        case ANGLEMIN_VALUE:
            return ANGLEMIN;
        case ANGLESEC_VALUE:
            return ANGLESEC;
        case HA_VALUE:
            return HA;
        case TONNE_VALUE:
            return TONNE;
        case BAR_VALUE:
            return BAR;
        case MM_HG_VALUE:
            return MM_HG;
        case M_VALUE:
            return M;
        case KN_VALUE:
            return KN;
        case VH_VALUE:
            return VH;
        case MX_VALUE:
            return MX;
        case G_VALUE:
            return G;
        case OE_VALUE:
            return OE;
        case WPER_A_VALUE:
            return WPER_A;
        case SPERM_VALUE:
            return SPERM;
        case ONE_PER_HZ_VALUE:
            return ONE_PER_HZ;
        case VPER_VAR_VALUE:
            return VPER_VAR;
        case OHM_PERM_VALUE:
            return OHM_PERM;
        case KG_PER_J_VALUE:
            return KG_PER_J;
        case JPERS_VALUE:
            return JPERS;
        case M2_PERS_VALUE:
            return M2_PERS;
        case JPERM2_VALUE:
            return JPERM2;
        case KPERS_VALUE:
            return KPERS;
        case PA_PERS_VALUE:
            return PA_PERS;
        }
        return null;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private final int value;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private final String name;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private final String literal;

    /**
     * Only this class can construct instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private UnitSymbol( int value, String name, String literal ) {
        this.value = value;
        this.name = name;
        this.literal = literal;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int getValue() {
        return value;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getLiteral() {
        return literal;
    }

    /**
     * Returns the literal value of the enumerator, which is its string representation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        return literal;
    }

} //UnitSymbol
