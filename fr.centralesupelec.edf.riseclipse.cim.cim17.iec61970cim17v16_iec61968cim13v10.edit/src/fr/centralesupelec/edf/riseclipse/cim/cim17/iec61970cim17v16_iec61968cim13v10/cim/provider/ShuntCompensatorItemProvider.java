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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ShuntCompensator;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ShuntCompensator} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ShuntCompensatorItemProvider extends RegulatingCondEqItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ShuntCompensatorItemProvider( AdapterFactory adapterFactory ) {
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

            addAVRDelayPropertyDescriptor( object );
            addGroundedPropertyDescriptor( object );
            addMaximumSectionsPropertyDescriptor( object );
            addNomUPropertyDescriptor( object );
            addNormalSectionsPropertyDescriptor( object );
            addPhaseConnectionPropertyDescriptor( object );
            addSectionsPropertyDescriptor( object );
            addSwitchOnCountPropertyDescriptor( object );
            addSwitchOnDatePropertyDescriptor( object );
            addVoltageSensitivityPropertyDescriptor( object );
            addSvShuntCompensatorSectionsPropertyDescriptor( object );
            addShuntCompensatorPhasePropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the AVR Delay feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addAVRDelayPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ShuntCompensator_aVRDelay_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ShuntCompensator_aVRDelay_feature",
                                "_UI_ShuntCompensator_type" ),
                        CimPackage.eINSTANCE.getShuntCompensator_AVRDelay(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Grounded feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addGroundedPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ShuntCompensator_grounded_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ShuntCompensator_grounded_feature",
                                "_UI_ShuntCompensator_type" ),
                        CimPackage.eINSTANCE.getShuntCompensator_Grounded(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Maximum Sections feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMaximumSectionsPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_ShuntCompensator_maximumSections_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_ShuntCompensator_maximumSections_feature",
                        "_UI_ShuntCompensator_type" ),
                CimPackage.eINSTANCE.getShuntCompensator_MaximumSections(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Nom U feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addNomUPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ShuntCompensator_nomU_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ShuntCompensator_nomU_feature",
                                "_UI_ShuntCompensator_type" ),
                        CimPackage.eINSTANCE.getShuntCompensator_NomU(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Normal Sections feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addNormalSectionsPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_ShuntCompensator_normalSections_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_ShuntCompensator_normalSections_feature",
                        "_UI_ShuntCompensator_type" ),
                CimPackage.eINSTANCE.getShuntCompensator_NormalSections(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Phase Connection feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPhaseConnectionPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_ShuntCompensator_phaseConnection_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_ShuntCompensator_phaseConnection_feature",
                        "_UI_ShuntCompensator_type" ),
                CimPackage.eINSTANCE.getShuntCompensator_PhaseConnection(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Sections feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSectionsPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ShuntCompensator_sections_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ShuntCompensator_sections_feature",
                                "_UI_ShuntCompensator_type" ),
                        CimPackage.eINSTANCE.getShuntCompensator_Sections(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Switch On Count feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSwitchOnCountPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ShuntCompensator_switchOnCount_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ShuntCompensator_switchOnCount_feature",
                                "_UI_ShuntCompensator_type" ),
                        CimPackage.eINSTANCE.getShuntCompensator_SwitchOnCount(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Switch On Date feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSwitchOnDatePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ShuntCompensator_switchOnDate_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ShuntCompensator_switchOnDate_feature",
                                "_UI_ShuntCompensator_type" ),
                        CimPackage.eINSTANCE.getShuntCompensator_SwitchOnDate(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Voltage Sensitivity feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addVoltageSensitivityPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_ShuntCompensator_voltageSensitivity_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_ShuntCompensator_voltageSensitivity_feature",
                        "_UI_ShuntCompensator_type" ),
                CimPackage.eINSTANCE.getShuntCompensator_VoltageSensitivity(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Sv Shunt Compensator Sections feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSvShuntCompensatorSectionsPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_ShuntCompensator_SvShuntCompensatorSections_feature" ),
                getString( "_UI_PropertyDescriptor_description",
                        "_UI_ShuntCompensator_SvShuntCompensatorSections_feature", "_UI_ShuntCompensator_type" ),
                CimPackage.eINSTANCE.getShuntCompensator_SvShuntCompensatorSections(), true, false, true, null, null,
                null ) );
    }

    /**
     * This adds a property descriptor for the Shunt Compensator Phase feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addShuntCompensatorPhasePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_ShuntCompensator_ShuntCompensatorPhase_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_ShuntCompensator_ShuntCompensatorPhase_feature",
                        "_UI_ShuntCompensator_type" ),
                CimPackage.eINSTANCE.getShuntCompensator_ShuntCompensatorPhase(), true, false, true, null, null,
                null ) );
    }

    /**
     * This returns ShuntCompensator.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/ShuntCompensator" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( ShuntCompensator ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_ShuntCompensator_type" )
                : getString( "_UI_ShuntCompensator_type" ) + " " + label;
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

        switch( notification.getFeatureID( ShuntCompensator.class ) ) {
        case CimPackage.SHUNT_COMPENSATOR__AVR_DELAY:
        case CimPackage.SHUNT_COMPENSATOR__GROUNDED:
        case CimPackage.SHUNT_COMPENSATOR__MAXIMUM_SECTIONS:
        case CimPackage.SHUNT_COMPENSATOR__NOM_U:
        case CimPackage.SHUNT_COMPENSATOR__NORMAL_SECTIONS:
        case CimPackage.SHUNT_COMPENSATOR__PHASE_CONNECTION:
        case CimPackage.SHUNT_COMPENSATOR__SECTIONS:
        case CimPackage.SHUNT_COMPENSATOR__SWITCH_ON_COUNT:
        case CimPackage.SHUNT_COMPENSATOR__SWITCH_ON_DATE:
        case CimPackage.SHUNT_COMPENSATOR__VOLTAGE_SENSITIVITY:
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
