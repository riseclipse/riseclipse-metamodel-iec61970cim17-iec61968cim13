/*
*************************************************************************
**  Copyright (c) 2019 CentraleSupélec & EDF.
**  All rights reserved. This program and the accompanying materials
**  are made available under the terms of the Eclipse Public License v2.0
**  which accompanies this distribution, and is available at
**  https://www.eclipse.org/legal/epl-v20.html
** 
**  This file is part of the RiseClipse tool
**  
**  Contributors:
**      Computer Science Department, CentraleSupélec
**      EDF R&D
**  Contacts:
**      dominique.marcadet@centralesupelec.fr
**      aurelie.dehouck-neveu@edf.fr
**  Web site:
**      http://wdi.supelec.fr/software/RiseClipse/
*************************************************************************
*/
package fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.provider;

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContPType3IEC;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContPType3IEC} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class WindContPType3IECItemProvider extends IdentifiedObjectItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public WindContPType3IECItemProvider( AdapterFactory adapterFactory ) {
        super( adapterFactory );
    }

    /**
     * This returns the property descriptors for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public List< IItemPropertyDescriptor > getPropertyDescriptors( Object object ) {
        if( itemPropertyDescriptors == null ) {
            super.getPropertyDescriptors( object );

            addDpmaxPropertyDescriptor( object );
            addDprefmaxPropertyDescriptor( object );
            addDprefminPropertyDescriptor( object );
            addDthetamaxPropertyDescriptor( object );
            addDthetamaxuvrtPropertyDescriptor( object );
            addKdtdPropertyDescriptor( object );
            addKipPropertyDescriptor( object );
            addKppPropertyDescriptor( object );
            addMpuvrtPropertyDescriptor( object );
            addOmegaoffsetPropertyDescriptor( object );
            addPdtdmaxPropertyDescriptor( object );
            addTdvsPropertyDescriptor( object );
            addThetaeminPropertyDescriptor( object );
            addThetauscalePropertyDescriptor( object );
            addTomegafiltp3PropertyDescriptor( object );
            addTpfiltp3PropertyDescriptor( object );
            addTpordPropertyDescriptor( object );
            addTufiltp3PropertyDescriptor( object );
            addTwrefPropertyDescriptor( object );
            addUdvsPropertyDescriptor( object );
            addUpdipPropertyDescriptor( object );
            addWdtdPropertyDescriptor( object );
            addZetaPropertyDescriptor( object );
            addWindDynamicsLookupTablePropertyDescriptor( object );
            addWindTurbineType3IECPropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Dpmax feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDpmaxPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_WindContPType3IEC_dpmax_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_WindContPType3IEC_dpmax_feature",
                                "_UI_WindContPType3IEC_type" ),
                        CimPackage.eINSTANCE.getWindContPType3IEC_Dpmax(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Dprefmax feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDprefmaxPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_WindContPType3IEC_dprefmax_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_WindContPType3IEC_dprefmax_feature",
                                "_UI_WindContPType3IEC_type" ),
                        CimPackage.eINSTANCE.getWindContPType3IEC_Dprefmax(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Dprefmin feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDprefminPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_WindContPType3IEC_dprefmin_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_WindContPType3IEC_dprefmin_feature",
                                "_UI_WindContPType3IEC_type" ),
                        CimPackage.eINSTANCE.getWindContPType3IEC_Dprefmin(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Dthetamax feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDthetamaxPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_WindContPType3IEC_dthetamax_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_WindContPType3IEC_dthetamax_feature",
                                "_UI_WindContPType3IEC_type" ),
                        CimPackage.eINSTANCE.getWindContPType3IEC_Dthetamax(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Dthetamaxuvrt feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDthetamaxuvrtPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_WindContPType3IEC_dthetamaxuvrt_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_WindContPType3IEC_dthetamaxuvrt_feature",
                                "_UI_WindContPType3IEC_type" ),
                        CimPackage.eINSTANCE.getWindContPType3IEC_Dthetamaxuvrt(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Kdtd feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKdtdPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_WindContPType3IEC_kdtd_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_WindContPType3IEC_kdtd_feature",
                                "_UI_WindContPType3IEC_type" ),
                        CimPackage.eINSTANCE.getWindContPType3IEC_Kdtd(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Kip feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKipPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_WindContPType3IEC_kip_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_WindContPType3IEC_kip_feature",
                                "_UI_WindContPType3IEC_type" ),
                        CimPackage.eINSTANCE.getWindContPType3IEC_Kip(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Kpp feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKppPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_WindContPType3IEC_kpp_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_WindContPType3IEC_kpp_feature",
                                "_UI_WindContPType3IEC_type" ),
                        CimPackage.eINSTANCE.getWindContPType3IEC_Kpp(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Mpuvrt feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMpuvrtPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_WindContPType3IEC_mpuvrt_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_WindContPType3IEC_mpuvrt_feature",
                                "_UI_WindContPType3IEC_type" ),
                        CimPackage.eINSTANCE.getWindContPType3IEC_Mpuvrt(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Omegaoffset feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addOmegaoffsetPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_WindContPType3IEC_omegaoffset_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_WindContPType3IEC_omegaoffset_feature",
                                "_UI_WindContPType3IEC_type" ),
                        CimPackage.eINSTANCE.getWindContPType3IEC_Omegaoffset(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Pdtdmax feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPdtdmaxPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_WindContPType3IEC_pdtdmax_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_WindContPType3IEC_pdtdmax_feature",
                                "_UI_WindContPType3IEC_type" ),
                        CimPackage.eINSTANCE.getWindContPType3IEC_Pdtdmax(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Tdvs feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTdvsPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_WindContPType3IEC_tdvs_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_WindContPType3IEC_tdvs_feature",
                                "_UI_WindContPType3IEC_type" ),
                        CimPackage.eINSTANCE.getWindContPType3IEC_Tdvs(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Thetaemin feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addThetaeminPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_WindContPType3IEC_thetaemin_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_WindContPType3IEC_thetaemin_feature",
                                "_UI_WindContPType3IEC_type" ),
                        CimPackage.eINSTANCE.getWindContPType3IEC_Thetaemin(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Thetauscale feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addThetauscalePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_WindContPType3IEC_thetauscale_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_WindContPType3IEC_thetauscale_feature",
                                "_UI_WindContPType3IEC_type" ),
                        CimPackage.eINSTANCE.getWindContPType3IEC_Thetauscale(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Tomegafiltp3 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTomegafiltp3PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_WindContPType3IEC_tomegafiltp3_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_WindContPType3IEC_tomegafiltp3_feature",
                                "_UI_WindContPType3IEC_type" ),
                        CimPackage.eINSTANCE.getWindContPType3IEC_Tomegafiltp3(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Tpfiltp3 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTpfiltp3PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_WindContPType3IEC_tpfiltp3_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_WindContPType3IEC_tpfiltp3_feature",
                                "_UI_WindContPType3IEC_type" ),
                        CimPackage.eINSTANCE.getWindContPType3IEC_Tpfiltp3(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Tpord feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTpordPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_WindContPType3IEC_tpord_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_WindContPType3IEC_tpord_feature",
                                "_UI_WindContPType3IEC_type" ),
                        CimPackage.eINSTANCE.getWindContPType3IEC_Tpord(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Tufiltp3 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTufiltp3PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_WindContPType3IEC_tufiltp3_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_WindContPType3IEC_tufiltp3_feature",
                                "_UI_WindContPType3IEC_type" ),
                        CimPackage.eINSTANCE.getWindContPType3IEC_Tufiltp3(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Twref feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTwrefPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_WindContPType3IEC_twref_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_WindContPType3IEC_twref_feature",
                                "_UI_WindContPType3IEC_type" ),
                        CimPackage.eINSTANCE.getWindContPType3IEC_Twref(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Udvs feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addUdvsPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_WindContPType3IEC_udvs_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_WindContPType3IEC_udvs_feature",
                                "_UI_WindContPType3IEC_type" ),
                        CimPackage.eINSTANCE.getWindContPType3IEC_Udvs(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Updip feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addUpdipPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_WindContPType3IEC_updip_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_WindContPType3IEC_updip_feature",
                                "_UI_WindContPType3IEC_type" ),
                        CimPackage.eINSTANCE.getWindContPType3IEC_Updip(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Wdtd feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addWdtdPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_WindContPType3IEC_wdtd_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_WindContPType3IEC_wdtd_feature",
                                "_UI_WindContPType3IEC_type" ),
                        CimPackage.eINSTANCE.getWindContPType3IEC_Wdtd(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Zeta feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addZetaPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_WindContPType3IEC_zeta_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_WindContPType3IEC_zeta_feature",
                                "_UI_WindContPType3IEC_type" ),
                        CimPackage.eINSTANCE.getWindContPType3IEC_Zeta(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Wind Dynamics Lookup Table feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addWindDynamicsLookupTablePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_WindContPType3IEC_WindDynamicsLookupTable_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_WindContPType3IEC_WindDynamicsLookupTable_feature", "_UI_WindContPType3IEC_type" ),
                        CimPackage.eINSTANCE.getWindContPType3IEC_WindDynamicsLookupTable(),
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Wind Turbine Type3 IEC feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addWindTurbineType3IECPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_WindContPType3IEC_WindTurbineType3IEC_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_WindContPType3IEC_WindTurbineType3IEC_feature", "_UI_WindContPType3IEC_type" ),
                        CimPackage.eINSTANCE.getWindContPType3IEC_WindTurbineType3IEC(),
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
    }

    /**
     * This returns WindContPType3IEC.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/WindContPType3IEC" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( WindContPType3IEC ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_WindContPType3IEC_type" )
                : getString( "_UI_WindContPType3IEC_type" ) + " " + label;
    }

    /**
     * This handles model notifications by calling {@link #updateChildren} to update any cached
     * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void notifyChanged( Notification notification ) {
        updateChildren( notification );

        switch( notification.getFeatureID( WindContPType3IEC.class ) ) {
        case CimPackage.WIND_CONT_PTYPE3_IEC__DPMAX:
        case CimPackage.WIND_CONT_PTYPE3_IEC__DPREFMAX:
        case CimPackage.WIND_CONT_PTYPE3_IEC__DPREFMIN:
        case CimPackage.WIND_CONT_PTYPE3_IEC__DTHETAMAX:
        case CimPackage.WIND_CONT_PTYPE3_IEC__DTHETAMAXUVRT:
        case CimPackage.WIND_CONT_PTYPE3_IEC__KDTD:
        case CimPackage.WIND_CONT_PTYPE3_IEC__KIP:
        case CimPackage.WIND_CONT_PTYPE3_IEC__KPP:
        case CimPackage.WIND_CONT_PTYPE3_IEC__MPUVRT:
        case CimPackage.WIND_CONT_PTYPE3_IEC__OMEGAOFFSET:
        case CimPackage.WIND_CONT_PTYPE3_IEC__PDTDMAX:
        case CimPackage.WIND_CONT_PTYPE3_IEC__TDVS:
        case CimPackage.WIND_CONT_PTYPE3_IEC__THETAEMIN:
        case CimPackage.WIND_CONT_PTYPE3_IEC__THETAUSCALE:
        case CimPackage.WIND_CONT_PTYPE3_IEC__TOMEGAFILTP3:
        case CimPackage.WIND_CONT_PTYPE3_IEC__TPFILTP3:
        case CimPackage.WIND_CONT_PTYPE3_IEC__TPORD:
        case CimPackage.WIND_CONT_PTYPE3_IEC__TUFILTP3:
        case CimPackage.WIND_CONT_PTYPE3_IEC__TWREF:
        case CimPackage.WIND_CONT_PTYPE3_IEC__UDVS:
        case CimPackage.WIND_CONT_PTYPE3_IEC__UPDIP:
        case CimPackage.WIND_CONT_PTYPE3_IEC__WDTD:
        case CimPackage.WIND_CONT_PTYPE3_IEC__ZETA:
            fireNotifyChanged( new ViewerNotification( notification, notification.getNotifier(), false, true ) );
            return;
        }
        super.notifyChanged( notification );
    }

    /**
     * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
     * that can be created under this object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected void collectNewChildDescriptors( Collection< Object > newChildDescriptors, Object object ) {
        super.collectNewChildDescriptors( newChildDescriptors, object );
    }

}
