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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cs Converter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CsConverter#getAlpha <em>Alpha</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CsConverter#getGamma <em>Gamma</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CsConverter#getMaxAlpha <em>Max Alpha</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CsConverter#getMaxGamma <em>Max Gamma</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CsConverter#getMaxIdc <em>Max Idc</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CsConverter#getMinAlpha <em>Min Alpha</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CsConverter#getMinGamma <em>Min Gamma</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CsConverter#getMinIdc <em>Min Idc</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CsConverter#getOperatingMode <em>Operating Mode</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CsConverter#getPPccControl <em>PPcc Control</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CsConverter#getRatedIdc <em>Rated Idc</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CsConverter#getTargetAlpha <em>Target Alpha</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CsConverter#getTargetGamma <em>Target Gamma</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CsConverter#getTargetIdc <em>Target Idc</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getCsConverter()
 * @model
 * @generated
 */
public interface CsConverter extends ACDCConverter {
    /**
     * Returns the value of the '<em><b>Alpha</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Alpha</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Alpha</em>' attribute.
     * @see #isSetAlpha()
     * @see #unsetAlpha()
     * @see #setAlpha(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getCsConverter_Alpha()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='CsConverter.alpha' kind='element'"
     * @generated
     */
    Float getAlpha();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CsConverter#getAlpha <em>Alpha</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Alpha</em>' attribute.
     * @see #isSetAlpha()
     * @see #unsetAlpha()
     * @see #getAlpha()
     * @generated
     */
    void setAlpha( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CsConverter#getAlpha <em>Alpha</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetAlpha()
     * @see #getAlpha()
     * @see #setAlpha(Float)
     * @generated
     */
    void unsetAlpha();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CsConverter#getAlpha <em>Alpha</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Alpha</em>' attribute is set.
     * @see #unsetAlpha()
     * @see #getAlpha()
     * @see #setAlpha(Float)
     * @generated
     */
    boolean isSetAlpha();

    /**
     * Returns the value of the '<em><b>Gamma</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Gamma</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Gamma</em>' attribute.
     * @see #isSetGamma()
     * @see #unsetGamma()
     * @see #setGamma(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getCsConverter_Gamma()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='CsConverter.gamma' kind='element'"
     * @generated
     */
    Float getGamma();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CsConverter#getGamma <em>Gamma</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Gamma</em>' attribute.
     * @see #isSetGamma()
     * @see #unsetGamma()
     * @see #getGamma()
     * @generated
     */
    void setGamma( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CsConverter#getGamma <em>Gamma</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetGamma()
     * @see #getGamma()
     * @see #setGamma(Float)
     * @generated
     */
    void unsetGamma();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CsConverter#getGamma <em>Gamma</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Gamma</em>' attribute is set.
     * @see #unsetGamma()
     * @see #getGamma()
     * @see #setGamma(Float)
     * @generated
     */
    boolean isSetGamma();

    /**
     * Returns the value of the '<em><b>Max Alpha</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Max Alpha</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Max Alpha</em>' attribute.
     * @see #isSetMaxAlpha()
     * @see #unsetMaxAlpha()
     * @see #setMaxAlpha(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getCsConverter_MaxAlpha()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='CsConverter.maxAlpha' kind='element'"
     * @generated
     */
    Float getMaxAlpha();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CsConverter#getMaxAlpha <em>Max Alpha</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Max Alpha</em>' attribute.
     * @see #isSetMaxAlpha()
     * @see #unsetMaxAlpha()
     * @see #getMaxAlpha()
     * @generated
     */
    void setMaxAlpha( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CsConverter#getMaxAlpha <em>Max Alpha</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMaxAlpha()
     * @see #getMaxAlpha()
     * @see #setMaxAlpha(Float)
     * @generated
     */
    void unsetMaxAlpha();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CsConverter#getMaxAlpha <em>Max Alpha</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Max Alpha</em>' attribute is set.
     * @see #unsetMaxAlpha()
     * @see #getMaxAlpha()
     * @see #setMaxAlpha(Float)
     * @generated
     */
    boolean isSetMaxAlpha();

    /**
     * Returns the value of the '<em><b>Max Gamma</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Max Gamma</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Max Gamma</em>' attribute.
     * @see #isSetMaxGamma()
     * @see #unsetMaxGamma()
     * @see #setMaxGamma(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getCsConverter_MaxGamma()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='CsConverter.maxGamma' kind='element'"
     * @generated
     */
    Float getMaxGamma();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CsConverter#getMaxGamma <em>Max Gamma</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Max Gamma</em>' attribute.
     * @see #isSetMaxGamma()
     * @see #unsetMaxGamma()
     * @see #getMaxGamma()
     * @generated
     */
    void setMaxGamma( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CsConverter#getMaxGamma <em>Max Gamma</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMaxGamma()
     * @see #getMaxGamma()
     * @see #setMaxGamma(Float)
     * @generated
     */
    void unsetMaxGamma();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CsConverter#getMaxGamma <em>Max Gamma</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Max Gamma</em>' attribute is set.
     * @see #unsetMaxGamma()
     * @see #getMaxGamma()
     * @see #setMaxGamma(Float)
     * @generated
     */
    boolean isSetMaxGamma();

    /**
     * Returns the value of the '<em><b>Max Idc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Max Idc</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Max Idc</em>' attribute.
     * @see #isSetMaxIdc()
     * @see #unsetMaxIdc()
     * @see #setMaxIdc(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getCsConverter_MaxIdc()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='CsConverter.maxIdc' kind='element'"
     * @generated
     */
    Float getMaxIdc();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CsConverter#getMaxIdc <em>Max Idc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Max Idc</em>' attribute.
     * @see #isSetMaxIdc()
     * @see #unsetMaxIdc()
     * @see #getMaxIdc()
     * @generated
     */
    void setMaxIdc( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CsConverter#getMaxIdc <em>Max Idc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMaxIdc()
     * @see #getMaxIdc()
     * @see #setMaxIdc(Float)
     * @generated
     */
    void unsetMaxIdc();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CsConverter#getMaxIdc <em>Max Idc</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Max Idc</em>' attribute is set.
     * @see #unsetMaxIdc()
     * @see #getMaxIdc()
     * @see #setMaxIdc(Float)
     * @generated
     */
    boolean isSetMaxIdc();

    /**
     * Returns the value of the '<em><b>Min Alpha</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Min Alpha</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Min Alpha</em>' attribute.
     * @see #isSetMinAlpha()
     * @see #unsetMinAlpha()
     * @see #setMinAlpha(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getCsConverter_MinAlpha()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='CsConverter.minAlpha' kind='element'"
     * @generated
     */
    Float getMinAlpha();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CsConverter#getMinAlpha <em>Min Alpha</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Min Alpha</em>' attribute.
     * @see #isSetMinAlpha()
     * @see #unsetMinAlpha()
     * @see #getMinAlpha()
     * @generated
     */
    void setMinAlpha( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CsConverter#getMinAlpha <em>Min Alpha</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMinAlpha()
     * @see #getMinAlpha()
     * @see #setMinAlpha(Float)
     * @generated
     */
    void unsetMinAlpha();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CsConverter#getMinAlpha <em>Min Alpha</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Min Alpha</em>' attribute is set.
     * @see #unsetMinAlpha()
     * @see #getMinAlpha()
     * @see #setMinAlpha(Float)
     * @generated
     */
    boolean isSetMinAlpha();

    /**
     * Returns the value of the '<em><b>Min Gamma</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Min Gamma</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Min Gamma</em>' attribute.
     * @see #isSetMinGamma()
     * @see #unsetMinGamma()
     * @see #setMinGamma(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getCsConverter_MinGamma()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='CsConverter.minGamma' kind='element'"
     * @generated
     */
    Float getMinGamma();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CsConverter#getMinGamma <em>Min Gamma</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Min Gamma</em>' attribute.
     * @see #isSetMinGamma()
     * @see #unsetMinGamma()
     * @see #getMinGamma()
     * @generated
     */
    void setMinGamma( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CsConverter#getMinGamma <em>Min Gamma</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMinGamma()
     * @see #getMinGamma()
     * @see #setMinGamma(Float)
     * @generated
     */
    void unsetMinGamma();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CsConverter#getMinGamma <em>Min Gamma</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Min Gamma</em>' attribute is set.
     * @see #unsetMinGamma()
     * @see #getMinGamma()
     * @see #setMinGamma(Float)
     * @generated
     */
    boolean isSetMinGamma();

    /**
     * Returns the value of the '<em><b>Min Idc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Min Idc</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Min Idc</em>' attribute.
     * @see #isSetMinIdc()
     * @see #unsetMinIdc()
     * @see #setMinIdc(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getCsConverter_MinIdc()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='CsConverter.minIdc' kind='element'"
     * @generated
     */
    Float getMinIdc();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CsConverter#getMinIdc <em>Min Idc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Min Idc</em>' attribute.
     * @see #isSetMinIdc()
     * @see #unsetMinIdc()
     * @see #getMinIdc()
     * @generated
     */
    void setMinIdc( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CsConverter#getMinIdc <em>Min Idc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMinIdc()
     * @see #getMinIdc()
     * @see #setMinIdc(Float)
     * @generated
     */
    void unsetMinIdc();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CsConverter#getMinIdc <em>Min Idc</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Min Idc</em>' attribute is set.
     * @see #unsetMinIdc()
     * @see #getMinIdc()
     * @see #setMinIdc(Float)
     * @generated
     */
    boolean isSetMinIdc();

    /**
     * Returns the value of the '<em><b>Operating Mode</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CsOperatingModeKind}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Operating Mode</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Operating Mode</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CsOperatingModeKind
     * @see #isSetOperatingMode()
     * @see #unsetOperatingMode()
     * @see #setOperatingMode(CsOperatingModeKind)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getCsConverter_OperatingMode()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='CsConverter.operatingMode' kind='element'"
     * @generated
     */
    CsOperatingModeKind getOperatingMode();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CsConverter#getOperatingMode <em>Operating Mode</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Operating Mode</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CsOperatingModeKind
     * @see #isSetOperatingMode()
     * @see #unsetOperatingMode()
     * @see #getOperatingMode()
     * @generated
     */
    void setOperatingMode( CsOperatingModeKind value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CsConverter#getOperatingMode <em>Operating Mode</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetOperatingMode()
     * @see #getOperatingMode()
     * @see #setOperatingMode(CsOperatingModeKind)
     * @generated
     */
    void unsetOperatingMode();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CsConverter#getOperatingMode <em>Operating Mode</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Operating Mode</em>' attribute is set.
     * @see #unsetOperatingMode()
     * @see #getOperatingMode()
     * @see #setOperatingMode(CsOperatingModeKind)
     * @generated
     */
    boolean isSetOperatingMode();

    /**
     * Returns the value of the '<em><b>PPcc Control</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CsPpccControlKind}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>PPcc Control</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>PPcc Control</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CsPpccControlKind
     * @see #isSetPPccControl()
     * @see #unsetPPccControl()
     * @see #setPPccControl(CsPpccControlKind)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getCsConverter_PPccControl()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='CsConverter.pPccControl' kind='element'"
     * @generated
     */
    CsPpccControlKind getPPccControl();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CsConverter#getPPccControl <em>PPcc Control</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>PPcc Control</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CsPpccControlKind
     * @see #isSetPPccControl()
     * @see #unsetPPccControl()
     * @see #getPPccControl()
     * @generated
     */
    void setPPccControl( CsPpccControlKind value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CsConverter#getPPccControl <em>PPcc Control</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPPccControl()
     * @see #getPPccControl()
     * @see #setPPccControl(CsPpccControlKind)
     * @generated
     */
    void unsetPPccControl();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CsConverter#getPPccControl <em>PPcc Control</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>PPcc Control</em>' attribute is set.
     * @see #unsetPPccControl()
     * @see #getPPccControl()
     * @see #setPPccControl(CsPpccControlKind)
     * @generated
     */
    boolean isSetPPccControl();

    /**
     * Returns the value of the '<em><b>Rated Idc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Rated Idc</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Rated Idc</em>' attribute.
     * @see #isSetRatedIdc()
     * @see #unsetRatedIdc()
     * @see #setRatedIdc(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getCsConverter_RatedIdc()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='CsConverter.ratedIdc' kind='element'"
     * @generated
     */
    Float getRatedIdc();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CsConverter#getRatedIdc <em>Rated Idc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Rated Idc</em>' attribute.
     * @see #isSetRatedIdc()
     * @see #unsetRatedIdc()
     * @see #getRatedIdc()
     * @generated
     */
    void setRatedIdc( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CsConverter#getRatedIdc <em>Rated Idc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRatedIdc()
     * @see #getRatedIdc()
     * @see #setRatedIdc(Float)
     * @generated
     */
    void unsetRatedIdc();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CsConverter#getRatedIdc <em>Rated Idc</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Rated Idc</em>' attribute is set.
     * @see #unsetRatedIdc()
     * @see #getRatedIdc()
     * @see #setRatedIdc(Float)
     * @generated
     */
    boolean isSetRatedIdc();

    /**
     * Returns the value of the '<em><b>Target Alpha</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Target Alpha</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Target Alpha</em>' attribute.
     * @see #isSetTargetAlpha()
     * @see #unsetTargetAlpha()
     * @see #setTargetAlpha(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getCsConverter_TargetAlpha()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='CsConverter.targetAlpha' kind='element'"
     * @generated
     */
    Float getTargetAlpha();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CsConverter#getTargetAlpha <em>Target Alpha</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Target Alpha</em>' attribute.
     * @see #isSetTargetAlpha()
     * @see #unsetTargetAlpha()
     * @see #getTargetAlpha()
     * @generated
     */
    void setTargetAlpha( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CsConverter#getTargetAlpha <em>Target Alpha</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTargetAlpha()
     * @see #getTargetAlpha()
     * @see #setTargetAlpha(Float)
     * @generated
     */
    void unsetTargetAlpha();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CsConverter#getTargetAlpha <em>Target Alpha</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Target Alpha</em>' attribute is set.
     * @see #unsetTargetAlpha()
     * @see #getTargetAlpha()
     * @see #setTargetAlpha(Float)
     * @generated
     */
    boolean isSetTargetAlpha();

    /**
     * Returns the value of the '<em><b>Target Gamma</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Target Gamma</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Target Gamma</em>' attribute.
     * @see #isSetTargetGamma()
     * @see #unsetTargetGamma()
     * @see #setTargetGamma(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getCsConverter_TargetGamma()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='CsConverter.targetGamma' kind='element'"
     * @generated
     */
    Float getTargetGamma();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CsConverter#getTargetGamma <em>Target Gamma</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Target Gamma</em>' attribute.
     * @see #isSetTargetGamma()
     * @see #unsetTargetGamma()
     * @see #getTargetGamma()
     * @generated
     */
    void setTargetGamma( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CsConverter#getTargetGamma <em>Target Gamma</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTargetGamma()
     * @see #getTargetGamma()
     * @see #setTargetGamma(Float)
     * @generated
     */
    void unsetTargetGamma();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CsConverter#getTargetGamma <em>Target Gamma</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Target Gamma</em>' attribute is set.
     * @see #unsetTargetGamma()
     * @see #getTargetGamma()
     * @see #setTargetGamma(Float)
     * @generated
     */
    boolean isSetTargetGamma();

    /**
     * Returns the value of the '<em><b>Target Idc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Target Idc</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Target Idc</em>' attribute.
     * @see #isSetTargetIdc()
     * @see #unsetTargetIdc()
     * @see #setTargetIdc(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getCsConverter_TargetIdc()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='CsConverter.targetIdc' kind='element'"
     * @generated
     */
    Float getTargetIdc();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CsConverter#getTargetIdc <em>Target Idc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Target Idc</em>' attribute.
     * @see #isSetTargetIdc()
     * @see #unsetTargetIdc()
     * @see #getTargetIdc()
     * @generated
     */
    void setTargetIdc( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CsConverter#getTargetIdc <em>Target Idc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTargetIdc()
     * @see #getTargetIdc()
     * @see #setTargetIdc(Float)
     * @generated
     */
    void unsetTargetIdc();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CsConverter#getTargetIdc <em>Target Idc</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Target Idc</em>' attribute is set.
     * @see #unsetTargetIdc()
     * @see #getTargetIdc()
     * @see #setTargetIdc(Float)
     * @generated
     */
    boolean isSetTargetIdc();

} // CsConverter
